package ru.zalex.zkmin.web.viewmodel;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import ru.zalex.zkmin.model.Primitive;
import ru.zalex.zkmin.repository.PrimitiveRepository;

import java.util.List;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class PrimitiveVM {
    @WireVariable
    private PrimitiveRepository primitiveRepository;

    /**
     * Изменения getPrimitiveList отслеживаются в @NotifyChange("primitiveList")
     * после чего zul автоматически перерисовывается после удаления.
     */
    public List<Primitive> getPrimitiveList() {
        return (List<Primitive>) primitiveRepository.findAll();
    }

    @Command
    @NotifyChange("primitiveList")
    public void delete(@BindingParam("primitive") Primitive primitive) {
        primitiveRepository.delete(primitive);
    }


    public PrimitiveRepository getPrimitiveRepository() {
        return primitiveRepository;
    }
}