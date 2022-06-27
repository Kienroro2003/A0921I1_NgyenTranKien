import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularColorPickerAppComponent } from './angular-color-picker-app.component';

describe('AngularColorPickerAppComponent', () => {
  let component: AngularColorPickerAppComponent;
  let fixture: ComponentFixture<AngularColorPickerAppComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AngularColorPickerAppComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AngularColorPickerAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
