import {Child} from "./child";

export interface Parent {
  id: number,
  name: string,
  group: string,
  teacher: Child,
  content: string,
  email: string,
  phoneNumber: string
}
