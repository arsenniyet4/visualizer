import { Injectable, signal } from "@angular/core";
import { Project } from "../models/project.model";
import { User } from "../models/user.model";

@Injectable({
  providedIn: "root"
})

export class AppStore {
    public projects: Project[] = [];
    public users: User[] = [];
}