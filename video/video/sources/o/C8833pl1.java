package o;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.pl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8833pl1 {
    public ArrayList<C8379nt2> a = new ArrayList<>();
    public ArrayList<RK> b = new ArrayList<>();

    public void a(RK rk) {
        this.b.add(rk);
    }

    public void b(C8379nt2 c8379nt2) {
        this.a.add(c8379nt2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        if (!this.a.isEmpty()) {
            sb.append("Transitions:{\n");
            Iterator<C8379nt2> it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
            sb.append("},\n");
        }
        if (!this.b.isEmpty()) {
            sb.append("ConstraintSets:{\n");
            Iterator<RK> it2 = this.b.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toString());
            }
            sb.append("},\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
