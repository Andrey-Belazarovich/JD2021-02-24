package by.it.khrolovich.calc;

import java.util.Objects;

public class VarCreator {
    public VarCreator() {
    }

    static Var build(String strVar) throws CalcException {
        strVar = strVar.replaceAll("\\s+","");
        if (strVar.matches(Patterns.SCALAR)){
            return  new Scalar(strVar);
        } else if (strVar.matches(Patterns.VECTOR)){
            return  new Vector(strVar);
        } else if (strVar.matches(Patterns.MATRIX)){
            return  new Matrix(strVar);
        } else {
            //return null;//TODO stub - generate ERROR
            Var var = Var.load(strVar);
            if(Objects.nonNull(var)){
                return var;
            }
            throw new CalcException("unknow variable");
            //return Var.load(strVar);
        }
    }
}
