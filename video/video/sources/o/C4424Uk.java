package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.C8718pH0;
import o.LK;

/* renamed from: o.Uk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4424Uk extends C8718pH0 {
    public LK.f g;
    public int h;
    public ArrayList<SP1> i;

    public C4424Uk(String str) {
        super(str, new C8718pH0.a(C8718pH0.f.get(C8718pH0.b.BARRIER)));
        this.g = null;
        this.h = Integer.MIN_VALUE;
        this.i = new ArrayList<>();
    }

    public C4424Uk g(String str) {
        return h(SP1.g(str));
    }

    public C4424Uk h(SP1 sp1) {
        this.i.add(sp1);
        this.d.put("contains", k());
        return this;
    }

    public LK.f i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public String k() {
        if (this.i.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(C6566gU0.f);
        Iterator<SP1> it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public void l(LK.f fVar) {
        this.g = fVar;
        this.d.put("direction", C8718pH0.e.get(fVar));
    }

    public void m(int i) {
        this.h = i;
        this.d.put("margin", String.valueOf(i));
    }

    public C4424Uk(String str, String str2) {
        super(str, new C8718pH0.a(C8718pH0.f.get(C8718pH0.b.BARRIER)), str2);
        this.g = null;
        this.h = Integer.MIN_VALUE;
        this.i = new ArrayList<>();
        Map<String, String> b = b();
        this.d = b;
        if (b.containsKey("contains")) {
            SP1.a(this.d.get("contains"), this.i);
        }
    }
}
