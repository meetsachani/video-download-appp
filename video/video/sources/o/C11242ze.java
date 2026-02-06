package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.ze  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11242ze<K, V> extends AbstractC10363w1<K, V> implements Serializable {
    public static final int b1 = 16;
    public static final int c1 = 3;
    private static final long serialVersionUID = 20151118;
    public final int a1;

    public C11242ze() {
        this(16, 3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        f(new HashMap());
        c(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        d(objectOutputStream);
    }

    @Override // o.AbstractC10363w1
    /* renamed from: j */
    public ArrayList<V> h() {
        return new ArrayList<>(this.a1);
    }

    public void k() {
        Iterator<List<V>> it = e().values().iterator();
        while (it.hasNext()) {
            ((ArrayList) it.next()).trimToSize();
        }
    }

    public C11242ze(int i) {
        this(16, i);
    }

    public C11242ze(int i, int i2) {
        super(new HashMap(i));
        this.a1 = i2;
    }

    public C11242ze(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1) {
        this(interfaceC7846lm1.size(), 3);
        super.f0(interfaceC7846lm1);
    }

    public C11242ze(Map<? extends K, ? extends V> map) {
        this(map.size(), 3);
        super.putAll(map);
    }
}
