/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */
@Controller
@RequestMapping("/")
public class ControladorCliente {
    
    @RequestMapping(value="/cliente/{nombre}/{email}/{paterno}", method=RequestMethod.GET, headers={"Accept=text/html"})
    @ResponseBody String guardar(@PathVariable String nombre, @PathVariable String email, @PathVariable String paterno )throws Exception{
        Cliente c=new Cliente();
        c.setEmail(email);
        c.setNombre(nombre);
        c.setPaterno(paterno);
        DAOCliente d=new DAOCliente();
        d.guardar(c);
        return "Registro guardado";
    }
    
}
