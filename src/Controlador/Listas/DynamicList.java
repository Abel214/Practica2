package Controlador.Listas;

import Modelo.Tipos;

public class DynamicList <E>{
    private Node<E> header;
    private Node<E> last;
     Integer length;
    public DynamicList(){
        header = null;
        last = null;
        length = 0;
    }

    public Node<E> getHeader() {
        return header;
    }

    public void setHeader(Node<E> header) {
        this.header = header;
    }
    

    public void setLast(Node<E> last) {
        this.last = last;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean isEmpty(){
        return header == null||length.intValue()==0;
    }
    private void addHeader(E info) {
         Node<E> help;
            if(isEmpty()){
                help=new Node<>(info);
                header=help;
                last=help;
                length++;
            } else{
                Node<E> headHelp=header;
                help=new Node<>(info,headHelp);
                header=help;
                length++;
            }
        }
    private void addLast(E info) {
        Node<E> help;
        if (isEmpty()) {
            addHeader(info);
        } else {
            Node<E> lastHelp=last;
            help = new Node<>(info,null);
            lastHelp.setNext(help);
            last = help;
            length++;
        }
    }
    public void add(E info){
        addLast(info);
    }
    private E getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Error,Lista Vacia");

        } else{
            return header.getInfo();
        }
    }

    private E getLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Error,Lista Vacia");
        }

        return last.getInfo();

    }
    public E getInfo(Integer index) throws Exception{

        return getNode(index).getInfo();
    }
    public Node<E> getNode(Integer index) throws Exception{
        if(isEmpty()){
            throw new Exception("Fuera de lista") ;
        } else if(index.intValue()<0 || index.intValue()>=length){
            throw new IndexOutOfBoundsException("Error,fuera de rango");
        } else if(index.intValue()==0){
            return header;
        }else if(index.intValue()==(length-1)){
            return last;
        } else {
            Node<E> search = header;
            int cont = 0;
            while (cont < index) {
                cont++;
                search = search.getNext();
            }
            return search;
        }
    }
    
    public void add(E info,Integer index) throws Exception{
        if(isEmpty() || index.intValue()==0){
            addHeader(info);
        } else if(index.intValue()==length){
            addLast(info);
        } else {

            Node<E> search_preview=getNode(index);
            Node<E> search=getNode(index);
            Node <E> help=new Node <>(info,search);
            search_preview.setNext(help);
            length++;

        }
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder("Lista data: "); //StringBuilder= anidas mas cadenas y sale solo una
        try{
            isEmpty();
            Node<E> help=header;
            while(help != null){
                sb.append(help.getInfo()); //append= anidir
                help=help.getNext();
            }
        } catch(Exception e){
            sb.append(e.getMessage());
        }
        return sb.toString();
    }
     public DynamicList<Tipos> getInfo1(int fila) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEstado_Casa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public int getId_casa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
