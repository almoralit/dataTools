import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }
/* Afiliación */
  postAfiliacion (data : any){
    return this.http.post<any>("http://192.168.0.22:8080/afiliacion", data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  getAfiliacion (){
    return this.http.get<any>("http://192.168.0.22:8080/afiliacion")
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  updateAfiliacion (data : any, id:number){
    return this.http.put<any>("http://192.168.0.22:8080/afiliacion"+id,data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }


/* Usuario */
postUsuario (data : any){
  return this.http.post<any>("http://192.168.0.22:8080/usuario", data)
  .pipe(map((res:any)=>{
    return res;
  }))
}

getUsuario (){
  return this.http.get<any>("http://192.168.0.22:8080/usuarios")
  .pipe(map((res:any)=>{
    return res;
  }))
}

updateUsuario (data : any, id:number){
  return this.http.put<any>("http://192.168.0.22:8080/usuarios"+id,data)
  .pipe(map((res:any)=>{
    return res;
  }))
}

deleteUsuario (id:number){
  return this.http.delete<any>("http://192.168.0.22:8080/usuarios"+id)
  .pipe(map((res:any)=>{
    return res;
  }))
}

/* Vehículo */
postVehiculo (data : any){
  return this.http.post<any>("http://192.168.0.22:8080/vehiculo", data)
  .pipe(map((res:any)=>{
    return res;
  }))
}

getVehiculo (){
  return this.http.get<any>("http://192.168.0.22:8080/vehiculo")
  .pipe(map((res:any)=>{
    return res;
  }))
}

updateVehiculo(data : any, id:number){
  return this.http.put<any>("http://192.168.0.22:8080/vehiculo/"+id,data)
  .pipe(map((res:any)=>{
    return res;
  }))
}


/* Empresa */
postEmpresa (data : any){
  return this.http.post<any>("http://192.168.0.22:8080/empresa", data)
  .pipe(map((res:any)=>{
    return res;
  }))
}

getEmpresa (){
  return this.http.get<any>("http://192.168.0.22:8080/empresa")
  .pipe(map((res:any)=>{
    return res;
  }))
}

updateEmpresa(data : any, id:number){
  return this.http.put<any>("http://192.168.0.22:8080/empresa"+id,data)
  .pipe(map((res:any)=>{
    return res;
  }))
}

}
