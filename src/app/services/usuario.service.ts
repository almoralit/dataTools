import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class UsuarioService {

  url= 'http://192.168.0.19:8080/usuario'

  constructor(private http: HttpClient) {
    
    console.log('Servicio usuario')
    
  }

  getUsuario(){
    let header = new HttpHeaders()
      .set('Type-content','aplication/json')
    
    return this.http.get(this.url, {
      headers: header
    });
  }



}
