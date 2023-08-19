package lista;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    import java.util.ArrayList;
import java.util.List;

    public class ClsArraylist {
        public void listavalores() {
            List<String> Lista = new ArrayList<String>();
            Lista.add("1000");
            Lista.add("2000");
            Lista.add("3000");
            Lista.add("4000");

            int valor = 0;

            for ( String List : Lista ){
                Integer.parseInt(Lista.get(0));
                valor = Integer.parseInt(Lista.get(0));
                valor = valor + valor;

                valor++;
            }
            System.out.println("El valor de la lista es: " + valor);

        }

        public void ejemplo1(){
            List<String> tasklist = new ArrayList<String>();


            String lectura = "Ir a votar";
            tasklist.add(lectura);
            tasklist.add("Hacer compras ");
            tasklist.add("Sacar al perro");
            tasklist.add("Hacer la cama");
            tasklist.add("Lavar los platos");
            tasklist.add("Hacer la comida");
            tasklist.add("Hacer la cena");
            tasklist.add("Ir a votar");
            //System.out.print(tasklist);
            //String primertarea = tasklist.get(0);
            //System.out.print("La primera tarea es: " + primertarea);
            //tasklist.remove(0);
            //primertarea = tasklist.get(0);
            //System.out.print("La segunda tarea es: " + primertarea);
            int elementos = 1;
            for ( String tarea : tasklist){
                System.out.println(elementos+" Tarea " + tarea);//A esto se le llama iteracion(iterate)
                elementos++;
            }
        }

        public void listaTareas(){
            List<TaskList> task = new ArrayList<TaskList>();
            TaskList tareaIndividual = new TaskList();
            tareaIndividual.setTaskname("Hacer compras");
            tareaIndividual.setTaskdescription("Ir a la torre");
            tareaIndividual.setDone(false);
            task.add(tareaIndividual);
            tareaIndividual = new TaskList();

            tareaIndividual.setTaskname("Sacar al perro");
            tareaIndividual.setTaskdescription("llevarlo al parque y jugar con el");
            tareaIndividual.setDone(false);
            task.add(tareaIndividual);
            tareaIndividual = new TaskList();


            tareaIndividual.setTaskname("Hacer la cama");
            tareaIndividual.setTaskdescription("si no lo hagon me regañan");
            tareaIndividual.setDone(false);
            task.add(tareaIndividual);
            tareaIndividual = new TaskList();

            tareaIndividual.setTaskname("Ir a votar");
            tareaIndividual.setTaskdescription("Cumplir con mi pais");
            tareaIndividual.setDone(false);
            task.add(tareaIndividual);
            tareaIndividual = new TaskList();
            task.get(1).setDone(true);
            task.get(3).setDone(true);

            int tarea_numero = 1;

            for ( TaskList tl : task){
                if (!tl.isDone()) {
                    System.out.println(tarea_numero + " Tarea " + tl.getTaskname() + " Descripcion: " + tl.getTaskdescription() + " Estado: " + tl.isDone());

                }
                tarea_numero++;
            }
}
