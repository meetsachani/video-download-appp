package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.C8718pH0;
import o.LK;

/* renamed from: o.Sz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4284Sz extends C8718pH0 {
    public static final Map<b, String> i;
    public b g;
    public ArrayList<SP1> h;

    /* renamed from: o.Sz$a */
    /* loaded from: classes.dex */
    public class a {
        public final LK.f a;
        public int c;
        public LK.a b = null;
        public int d = Integer.MIN_VALUE;

        public a(LK.f fVar) {
            this.a = fVar;
        }

        public void a(StringBuilder sb) {
            if (this.b != null) {
                sb.append(this.a.toString().toLowerCase());
                sb.append(":");
                sb.append(this);
                sb.append(",\n");
            }
        }

        public String b() {
            return AbstractC4284Sz.this.a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(C6566gU0.f);
            if (this.b != null) {
                sb.append("'");
                sb.append(this.b.b());
                sb.append("',");
                sb.append("'");
                sb.append(this.b.a.toString().toLowerCase());
                sb.append("'");
            }
            if (this.c != 0) {
                sb.append(",");
                sb.append(this.c);
            }
            if (this.d != Integer.MIN_VALUE) {
                if (this.c == 0) {
                    sb.append(",0,");
                    sb.append(this.d);
                } else {
                    sb.append(",");
                    sb.append(this.d);
                }
            }
            sb.append(C6566gU0.g);
            return sb.toString();
        }
    }

    /* renamed from: o.Sz$b */
    /* loaded from: classes.dex */
    public enum b {
        PACKED,
        SPREAD,
        SPREAD_INSIDE
    }

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put(b.SPREAD, "'spread'");
        hashMap.put(b.SPREAD_INSIDE, "'spread_inside'");
        hashMap.put(b.PACKED, "'packed'");
    }

    public AbstractC4284Sz(String str) {
        super(str, new C8718pH0.a(""));
        this.g = null;
        this.h = new ArrayList<>();
    }

    public AbstractC4284Sz g(String str) {
        return h(SP1.g(str));
    }

    public AbstractC4284Sz h(SP1 sp1) {
        this.h.add(sp1);
        this.d.put("contains", j());
        return this;
    }

    public b i() {
        return this.g;
    }

    public String j() {
        if (this.h.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(C6566gU0.f);
        Iterator<SP1> it = this.h.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public void k(b bVar) {
        this.g = bVar;
        this.d.put("style", i.get(bVar));
    }
}
