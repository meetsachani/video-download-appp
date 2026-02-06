package o;

/* renamed from: o.l1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7662l1 implements KX0 {
    public Object X;
    public Object Y;

    public AbstractC7662l1(Object obj, Object obj2) {
        this.X = obj;
        this.Y = obj2;
    }

    @Override // o.KX0
    public Object getKey() {
        return this.X;
    }

    @Override // o.KX0
    public Object getValue() {
        return this.Y;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getKey());
        stringBuffer.append('=');
        stringBuffer.append(getValue());
        return stringBuffer.toString();
    }
}
