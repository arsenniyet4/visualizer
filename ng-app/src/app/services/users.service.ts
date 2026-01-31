import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: "root"
})

export class UsersService {
    constructor(private http: HttpClient) {}

    public getAllUsers(): Promise<any> {
    return new Promise(resolve => {
        this.http.get("http://localhost:8080/getAllUsers")
        .subscribe(data => {
            resolve(data);
        });
    });
    }
}