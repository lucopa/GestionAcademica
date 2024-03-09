package com.iesdvc.acceso.demoioc.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iesdvc.acceso.demoioc.modelos.Telefono;
import com.iesdvc.acceso.demoioc.modelos.Usuario;
import com.iesdvc.acceso.demoioc.repos.RepoRol;
import com.iesdvc.acceso.demoioc.repos.RepoTelefono;
import com.iesdvc.acceso.demoioc.repos.RepoUsuario;




@Controller
@RequestMapping("/usuarios")
public class ControllerUsuario {
    
    @Autowired
    private RepoUsuario repoUsuario;

    @Autowired
    private RepoTelefono repoTelefono;

    @Autowired
    private RepoRol repoRol;
    
    @GetMapping(path = "/")
    public String findAll(Model modelo) {
        List<Usuario> lUsuario = repoUsuario.findAll();
        modelo.addAttribute("usuarios", lUsuario);
        return "usuarios/usuarios";
    }

    @GetMapping("")
    public String findAll2(Model modelo) {
        return findAll(modelo);
    }
    
    
    @GetMapping("/add")
    public String addUsuario(Model modelo) {
        modelo.addAttribute("usuario", new Usuario());
        modelo.addAttribute("telefonos", repoTelefono.findAll());
        
        modelo.addAttribute("roles", repoRol.findAll());
        return "usuarios/add";
    }

    @PostMapping("/add")
    public String addUsuario(@ModelAttribute("usuario") @NonNull Usuario usuario) {
        repoUsuario.save(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/delete/{id}")
    public String deleteUsuarioForm(Model modelo, @PathVariable("id") @NonNull Long id) {
        Optional<Usuario> oUsuario = repoUsuario.findById(id);
        if (oUsuario.isPresent())
            modelo.addAttribute(
            "usuario", oUsuario.get());
        else {
            modelo.addAttribute(
                "mensaje", "El usuario consultado no existe.");
            return "error";
        }
        return "usuarios/delete";
    }

    @PostMapping("/delete/{id}")
    public String deleteUsuario(@PathVariable("id") @NonNull Long id) {
        repoUsuario.deleteById(id);
        return "redirect:/usuarios";
    }

    @GetMapping("/edit/{id}")
    public String editUsuarioForm(Model modelo, @PathVariable("id") @NonNull Long id) {
        Optional <Usuario> oUsuario = repoUsuario.findById(id);
        if(oUsuario.isPresent()) {
            modelo.addAttribute(
            "usuario", oUsuario.get());
            modelo.addAttribute(
                "roles", repoRol.findAll());
            return "usuarios/edit";
        } else {
            modelo.addAttribute("mensaje", "El usuario consultado no existe.");
            return "error";
        }
    }

    @GetMapping("/{id}/telefonos/add")
    public String telefonoAddForm(
        @PathVariable @NonNull Long id,
        Model modelo) {
        
        Optional<Usuario> oUsuario = repoUsuario.findById(id);

        if (!oUsuario.isPresent()) {
            modelo.addAttribute(
                "mensaje", "El usuario no existe");
            return "error";
        }


        modelo.addAttribute(
            "telefono", new Telefono());
        
        return "usuarios/telefonos/add";
    }

    @PostMapping("/{id}/telefonos/add")
    public String telefonoAdd(
        @PathVariable @NonNull Long id,
        @ModelAttribute("telefono") Telefono telefono,
        Model modelo) {
        
        Optional<Usuario> oUsuario = repoUsuario.findById(id);

        if (!oUsuario.isPresent()) {
            modelo.addAttribute(
                "mensaje", "El usuario no existe");
            return "error";
        }

        telefono.setUsuario(oUsuario.get());
        repoTelefono.save(telefono);
        
        
        return "redirect:/usuarios";
    }
    
    @GetMapping("/{id}/telefonos")
    public String telefonos(
        @PathVariable @NonNull Long id,
        Model modelo) {
        
        Optional<Usuario> oUsuario = repoUsuario.findById(id);

        if (!oUsuario.isPresent()) {
            modelo.addAttribute(
                "mensaje", "El usuario no existe");
            return "error";
        }

        modelo.addAttribute(
            "usuarios", repoUsuario.findAll());
        modelo.addAttribute(
            "usuarioActual", oUsuario.get());
        modelo.addAttribute(
            "telefonos", oUsuario.get().getTelefonos());

        modelo.addAttribute(
            "telefono", new Telefono());
        
        return "usuarios/telefonos/telefonos";
    }


    @GetMapping("/{idUser}/telefonos/{idTel}/edit")
    public String telefonoEditForm(
        @PathVariable @NonNull Long idUser,
        @PathVariable @NonNull Integer idTel,
        Model modelo) {
        
        Optional<Usuario> oUsuario = repoUsuario.findById(idUser);
        Optional<Telefono> oTelefono = repoTelefono.findById(idTel);

        if (!oUsuario.isPresent() ||
            !oTelefono.isPresent()) {
            modelo.addAttribute(
                "mensaje", "El teléfono o usuario no existen");
            return "error";
        }

        modelo.addAttribute(
            "usuario", oUsuario.get());

        modelo.addAttribute(
            "telefono", oTelefono.get());
        
        return "usuarios/telefonos/edit";
    }

}
