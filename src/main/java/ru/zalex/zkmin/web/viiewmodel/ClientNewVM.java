package ru.zalex.zkmin.web.viiewmodel;

import ru.zalex.zkmin.model.Client;
import ru.zalex.zkmin.repository.ClientRepository;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Window;
import java.util.List;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class ClientNewVM {

    @WireVariable
    private ClientRepository clientRepository;
    private List<Client> clients;
    private Client client;
    private Client selectedClient;
    private String name;
    private String email;
    private String phone;

//    @Init
//    public void init(@ContextParam(ContextType.VIEW) Window window,
//                     @ExecutionArgParam("employee") Employee employee) {
//        this.window = window;
//        this.employee = employee;
//
//        validator = new FormValidator();
//    }

    @Init
    public void init() {
        clients = clientRepository.findAllClient();
    }

    @Command
    public void createNewClient() {
        final Window win = (Window) Executions.createComponents("/admin/clientnew.zul", null, null);
    }

    @Command
    public void save() {
        client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setPhone(phone);
        clientRepository.save(client);
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Client getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(Client selectedClient) {
        this.selectedClient = selectedClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}