package o;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class RK {
    public final String a;
    public ArrayList<LK> b = new ArrayList<>();
    public ArrayList<C8718pH0> c = new ArrayList<>();

    public RK(String str) {
        this.a = str;
    }

    public void a(LK lk) {
        this.b.add(lk);
    }

    public void b(C8718pH0 c8718pH0) {
        this.c.add(c8718pH0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.a + ":{\n");
        if (!this.b.isEmpty()) {
            Iterator<LK> it = this.b.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
        }
        if (!this.c.isEmpty()) {
            Iterator<C8718pH0> it2 = this.c.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toString());
            }
        }
        sb.append("},\n");
        return sb.toString();
    }
}
