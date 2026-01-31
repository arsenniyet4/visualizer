import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { UsersService } from "../services/users.service";
import { AppStore } from "./app.store";

@Injectable({
  providedIn: "root"
})

export class UsersStore {
    
    constructor(
        private store: AppStore,
        private usersService: UsersService) {}

    public refresh(): Promise<any[]> {
    return this.usersService.getAllUsers()
        .then(users => {
            this.store.users = users;
            return this.store.users;
        })
        .catch(err => {
            console.error("❌ Failed to fetch users", err);
            this.store.users = [];
            return this.store.users;
        });
    }
}