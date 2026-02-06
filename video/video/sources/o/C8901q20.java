package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.q20  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8901q20 implements InterfaceC7910m20 {
    public WK2 d;
    public int f;
    public int g;
    public InterfaceC7910m20 a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public C10126v30 i = null;
    public boolean j = false;
    public List<InterfaceC7910m20> k = new ArrayList();
    public List<C8901q20> l = new ArrayList();

    /* renamed from: o.q20$a */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C8901q20(WK2 wk2) {
        this.d = wk2;
    }

    @Override // o.InterfaceC7910m20
    public void a(InterfaceC7910m20 interfaceC7910m20) {
        for (C8901q20 c8901q20 : this.l) {
            if (!c8901q20.j) {
                return;
            }
        }
        this.c = true;
        InterfaceC7910m20 interfaceC7910m202 = this.a;
        if (interfaceC7910m202 != null) {
            interfaceC7910m202.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        C8901q20 c8901q202 = null;
        int i = 0;
        for (C8901q20 c8901q203 : this.l) {
            if (!(c8901q203 instanceof C10126v30)) {
                i++;
                c8901q202 = c8901q203;
            }
        }
        if (c8901q202 != null && i == 1 && c8901q202.j) {
            C10126v30 c10126v30 = this.i;
            if (c10126v30 != null) {
                if (c10126v30.j) {
                    this.f = this.h * c10126v30.g;
                } else {
                    return;
                }
            }
            e(c8901q202.g + this.f);
        }
        InterfaceC7910m20 interfaceC7910m203 = this.a;
        if (interfaceC7910m203 != null) {
            interfaceC7910m203.a(this);
        }
    }

    public void b(InterfaceC7910m20 interfaceC7910m20) {
        this.k.add(interfaceC7910m20);
        if (this.j) {
            interfaceC7910m20.a(interfaceC7910m20);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public String d() {
        String str;
        String y = this.d.b.y();
        a aVar = this.e;
        if (aVar != a.LEFT && aVar != a.RIGHT) {
            str = y + "_VERTICAL";
        } else {
            str = y + "_HORIZONTAL";
        }
        return str + ":" + this.e.name();
    }

    public void e(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            for (InterfaceC7910m20 interfaceC7910m20 : this.k) {
                interfaceC7910m20.a(interfaceC7910m20);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.y());
        sb.append(":");
        sb.append(this.e);
        sb.append(C9811tl1.c);
        if (this.j) {
            obj = Integer.valueOf(this.g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
