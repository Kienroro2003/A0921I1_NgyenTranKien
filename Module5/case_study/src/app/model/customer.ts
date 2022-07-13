import {CustomerType} from "./customer-type";

export interface Customer {
  id: number;
  idCustomer: string;
  nameCustomer: string;
  dateOfBirth: Date;
  gender: boolean;
  idCard: string;
  phoneNumber: string;
  email: string;
  customerType: CustomerType;
  address: string;
}
