import { Component, OnInit } from '@angular/core';
import { vehiculoModel } from './vehiculo.model';
import {FormBuilder,FormGroup} from '@angular/forms'
import { ApiService } from './../shared/api.service';

@Component({
  selector: 'app-vehiculo',
  templateUrl: './vehiculo.component.html',
  styleUrls: ['./vehiculo.component.css']
})
export class VehiculoComponent implements OnInit {

  formValue !: FormGroup;
  vehiculoModelObj : vehiculoModel = new vehiculoModel();

  constructor(private formbuilder: FormBuilder, 
    private api: ApiService) { }

  ngOnInit(): void {
    this.formValue = this.formbuilder.group({
      motor: [''],
      placa: [''],
      chasis: [''],
      fecha_matricula: [''],
      modelo: [''],
      pasajeros_sentados: [''],
      pasajeros_pie: [''],
      peso_bruto: [''],
      peso_seco:[''],
      puertas: [''],
      marca: [''],
      línea: ['']

  })
}

  postVehiculoDetails(){
    this.vehiculoModelObj.motor = this.formValue.value.motor;
    this.vehiculoModelObj.placa = this.formValue.value.placa;
    this.vehiculoModelObj.chasis = this.formValue.value.chasis;
    this.vehiculoModelObj.fecha_matricula = this.formValue.value.fecha_Matricula;
    this.vehiculoModelObj.modelo = this.formValue.value.modelo;
    this.vehiculoModelObj.pasajeros_sentados = this.formValue.value.pasajeros_sentados;
    this.vehiculoModelObj.pasajeros_pie = this.formValue.value.pasajeros_pie;
    this.vehiculoModelObj.peso_bruto = this.formValue.value.peso_bruto;
    this.vehiculoModelObj.peso_seco = this.formValue.value.peso_seco;
    this.vehiculoModelObj.puertas = this.formValue.value.puertas;
    this.vehiculoModelObj.marca = this.formValue.value.marca;
    this.vehiculoModelObj.línea = this.formValue.value.línea;

    this.api.postVehiculo(this.vehiculoModelObj)
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
