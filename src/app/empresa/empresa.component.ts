import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup} from '@angular/forms'
import { ApiService } from './../shared/api.service';
import { empresaModel } from './empresa.model';

@Component({
  selector: 'app-empresa',
  templateUrl: './empresa.component.html',
  styleUrls: ['./empresa.component.css']
})
export class EmpresaComponent implements OnInit {
  formValue !: FormGroup;
  empresaModelObj : empresaModel = new empresaModel();

  constructor(private formbuilder: FormBuilder, 
    private api: ApiService) { }

  ngOnInit(): void {
    this.formValue = this.formbuilder.group({
      nombre: [''],
      tipo_Doc: [''],
      num_Doc: [''],
      direccion: [''],
      telefono: [''],
      area: ['']
     })
  }

  postEmpresaDetails(){
    this.empresaModelObj.tipo_Doc = this.formValue.value.tipo_Doc;
    this.empresaModelObj.num_Doc = this.formValue.value.numDoc;
    this.empresaModelObj.nombre = this.formValue.value.nombre;
    this.empresaModelObj.direccion = this.formValue.value.direccion;
    this.empresaModelObj.telefono = this.formValue.value.telefono;
    this.empresaModelObj.area = this.formValue.value.area;
    this.api.postEmpresa(this.empresaModelObj)
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

}
