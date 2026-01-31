import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { ProjectsStore } from '../../store/projects.store';
import { AppStore } from '../../store/app.store';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'test-page',
  imports: [CommonModule],
  templateUrl: './test-page.component.html',
  styleUrl: './test-page.component.scss',
})
export class TestPageComponent implements OnInit {

  testVariable: string = 'This is a test variable';
  
  constructor(
    private projectsStore: ProjectsStore,
    public store: AppStore,
    private changeDetectorRef: ChangeDetectorRef) {}

  ngOnInit(): void {
    this.projectsStore.refresh().then(() => {
      this.changeDetectorRef.markForCheck();
    });
  }  
}