import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: "root"
})

export class ProjectsService {
    constructor(private http: HttpClient) {}

    public getAllProjects(): Promise<any> {
    return new Promise(resolve => {
        this.http.get("http://localhost:8080/getAllProjects")
        .subscribe(data => {
            resolve(data);
        });
    });
    }
}