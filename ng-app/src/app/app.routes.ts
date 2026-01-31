import { Routes } from '@angular/router';
import { HomePageComponent } from './containers/home-page/home-page.component';
import { UploadPageComponent } from './containers/upload-page/upload-page.component';
import { TestPageComponent } from './containers/test-page/test-page.component';

export const routes: Routes = [
    { path: '', component: HomePageComponent },
    { path: 'upload-page', component: UploadPageComponent },
    { path: 'test-page', component: TestPageComponent }
];
