import { Injectable } from "@angular/core";
import { AppStore } from "./app.store";
import { ProjectsService } from "../services/projects.service";

@Injectable({
  providedIn: "root"
})

export class ProjectsStore {

    constructor(
        private store: AppStore,
        private projectsService: ProjectsService) {}

    public refresh(): Promise<any[]> {
    return this.projectsService.getAllProjects()
        .then(projects => {
            this.store.projects = projects;
            return this.store.projects;
        })
        .catch(err => {
            console.error("❌ Failed to fetch projects", err);
            this.store.projects = [];
            return this.store.projects;
        });
}
}