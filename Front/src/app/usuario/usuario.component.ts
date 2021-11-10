import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup} from '@angular/forms'
import { usuarioModel } from './usuario.model';
import { ApiService } from './../shared/api.service';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

  formValue !: FormGroup;
  usuarioModelObj : usuarioModel = new usuarioModel();
  usuarioData !:any;

  constructor(private formbuilder: FormBuilder, 
    private api: ApiService) { }

  ngOnInit(): void {
    this.formValue = this.formbuilder.group({
      nombres: [''],
      documento: [''],
      tipo_doc: [''],
      direccion: [''],
      telefono: [''],
      rol: ['']

    })
    this.getUsuario();

  }


  postUsuarioDetails(){
    
    this.usuarioModelObj.nombres = this.formValue.value.nombres;
    this.usuarioModelObj.tipo_doc = this.formValue.value.tipo_doc;
    this.usuarioModelObj.documento = this.formValue.value.documento;
    this.usuarioModelObj.direccion = this.formValue.value.direccion;
    this.usuarioModelObj.telefono = this.formValue.value.telefono;
    this.usuarioModelObj.rol = this.formValue.value.rol;

    this.api.postUsuario(this.usuarioModelObj)
    .subscribe(res=>{
      console.log(res);
      alert("Registro correcto")
      
      let ref= document.getElementById("cancel")
      ref?.click();

      this.formValue.reset(); 
    },
    err=>{
      alert("Error")
    })

  }

  getUsuario(){
    this.api.getUsuario()
    .subscribe(res=>{
      this.usuarioData = res;
    })
  }

  deleteUsuario(row : any){
    this.api.deleteUsuario(row.id)
    .subscribe(res=>{
      alert("Usuario eliminado")
    })
  }

}
