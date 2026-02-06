package o;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class FP extends AN2 {
    public FP(Object obj) {
        super(obj);
    }

    @Override // o.AN2, o.InterfaceC10878y80
    public void k(String str, Object obj) {
        try {
            C3651Mm.c(this.Y, str, obj);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            throw new IllegalArgumentException("Error setting property '" + str + "' nested exception - " + targetException);
        } catch (Throwable th) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Error setting property '" + str + "', exception - " + th);
            C3651Mm.p(illegalArgumentException, th);
            throw illegalArgumentException;
        }
    }
}
