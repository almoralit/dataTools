import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup} from '@angular/forms'
import { AfiliacionModel } from './afiliaciones.model';
import { ApiService } from './../shared/api.service';

@Component({
  selector: 'app-afiliaciones',
  templateUrl: './afiliaciones.component.html',
  styleUrls: ['./afiliaciones.component.css']
})
export class AfiliacionesComponent implements OnInit {

  formValue !: FormGroup;
  afiliacionesModelObj : AfiliacionModel = new AfiliacionModel();
  


  constructor(private formbuilder: FormBuilder, 
    private api: ApiService) { }

  ngOnInit(): void {
    this.formValue = this.formbuilder.group({
      empresa: [''],
      vehiculo: [''],
      conductor: ['']

    })

  }

  postAfiliacionDetails(){
    this.afiliacionesModelObj.empresa = this.formValue.value.empresa;
    this.afiliacionesModelObj.vehiculo = this.formValue.value.vehiculo;
    this.afiliacionesModelObj.conductor = this.formValue.value.conductor;

    this.api.postAfiliacion(this.afiliacionesModelObj)
    .subscribe(res=>{
      console.log(res);
      alert("Afiliación correcta")
      let ref= document.getElementById("cancel")
      ref?.click();
      this.formValue.reset(); 
    },
    err=>{
      alert("Error")
    })

  }

  
}
