package ru.zalex.zkmin.web.viewmodel;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Window;
import ru.zalex.zkmin.model.Primitive;
import ru.zalex.zkmin.repository.PrimitiveRepository;


@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class PrimitiveNewVM {
    @WireVariable
    private PrimitiveRepository primitiveRepository;

    private Primitive primitive;

    private char aChar = 'G';
    private boolean aBoolean = true;
    private byte aByte = 127;
    private short aShort = 32536;
    private int anInt = 1234567890;
    private long aLong = 123L;
    private float aFloat = 123.4567f;
    private double aDouble = 1234567.890;


    @Command
    public void createNewPrimitive() {
        final Window win = (Window) Executions.createComponents("/primitiveNew.zul", null, null);
    }

    @Command
    public void save() {
        primitive = new Primitive();
        primitive.setaChar(aChar);
        primitive.setaBoolean(aBoolean);
        primitive.setaByte(aByte);
        primitive.setaShort(aShort);
        primitive.setAnInt(anInt);
        primitive.setaLong(aLong);
        primitive.setaFloat(aFloat);
        primitive.setaDouble(aDouble);
        primitiveRepository.save(primitive);
    }


    public PrimitiveRepository getPrimitiveRepository() {
        return primitiveRepository;
    }

    public void setPrimitiveRepository(PrimitiveRepository primitiveRepository) {
        this.primitiveRepository = primitiveRepository;
    }

    public Primitive getPrimitive() {
        return primitive;
    }

    public void setPrimitive(Primitive primitive) {
        this.primitive = primitive;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }
}