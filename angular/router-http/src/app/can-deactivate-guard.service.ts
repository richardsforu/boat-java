import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, CanDeactivate, Router, RouterStateSnapshot } from '@angular/router';
import { ProductFormComponent } from './product-form/product-form.component';

@Injectable({
  providedIn: 'root'
})
export class CanDeactivateGuardService implements CanDeactivate<ProductFormComponent>{

  constructor(private router: Router) { }

  msg = "Abc";

  status: boolean;
  canDeactivate(component: ProductFormComponent) {

    if (component.productForm.dirty) {
      //const dialogRef = this._dialog.open(UnsavedChangesDialogComponent);
      // return dialogRef.afterClosed();
      this.status = confirm('Are you sure you want to disgard changes? ');
      return this.status;
    }
    return true;
  }


}
