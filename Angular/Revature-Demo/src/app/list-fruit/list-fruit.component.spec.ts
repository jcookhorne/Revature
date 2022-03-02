import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListFruitComponent } from './list-fruit.component';

describe('ListFruitComponent', () => {
  let component: ListFruitComponent;
  let fixture: ComponentFixture<ListFruitComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListFruitComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListFruitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
