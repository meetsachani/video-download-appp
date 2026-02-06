package o;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: o.sS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9498sS1 {
    public static final String d = "RequestTracker";
    public final Set<InterfaceC5334bS1> a = Collections.newSetFromMap(new WeakHashMap());
    public final Set<InterfaceC5334bS1> b = new HashSet();
    public boolean c;

    public void a(InterfaceC5334bS1 interfaceC5334bS1) {
        this.a.add(interfaceC5334bS1);
    }

    public boolean b(InterfaceC5334bS1 interfaceC5334bS1) {
        boolean z = true;
        if (interfaceC5334bS1 == null) {
            return true;
        }
        boolean remove = this.a.remove(interfaceC5334bS1);
        if (!this.b.remove(interfaceC5334bS1) && !remove) {
            z = false;
        }
        if (z) {
            interfaceC5334bS1.clear();
        }
        return z;
    }

    public void c() {
        for (InterfaceC5334bS1 interfaceC5334bS1 : SD2.l(this.a)) {
            b(interfaceC5334bS1);
        }
        this.b.clear();
    }

    public boolean d() {
        return this.c;
    }

    public void e() {
        this.c = true;
        for (InterfaceC5334bS1 interfaceC5334bS1 : SD2.l(this.a)) {
            if (interfaceC5334bS1.isRunning() || interfaceC5334bS1.g()) {
                interfaceC5334bS1.clear();
                this.b.add(interfaceC5334bS1);
            }
        }
    }

    public void f() {
        this.c = true;
        for (InterfaceC5334bS1 interfaceC5334bS1 : SD2.l(this.a)) {
            if (interfaceC5334bS1.isRunning()) {
                interfaceC5334bS1.pause();
                this.b.add(interfaceC5334bS1);
            }
        }
    }

    public void g() {
        for (InterfaceC5334bS1 interfaceC5334bS1 : SD2.l(this.a)) {
            if (!interfaceC5334bS1.g() && !interfaceC5334bS1.e()) {
                interfaceC5334bS1.clear();
                if (!this.c) {
                    interfaceC5334bS1.i();
                } else {
                    this.b.add(interfaceC5334bS1);
                }
            }
        }
    }

    public void h() {
        this.c = false;
        for (InterfaceC5334bS1 interfaceC5334bS1 : SD2.l(this.a)) {
            if (!interfaceC5334bS1.g() && !interfaceC5334bS1.isRunning()) {
                interfaceC5334bS1.i();
            }
        }
        this.b.clear();
    }

    public void i(InterfaceC5334bS1 interfaceC5334bS1) {
        this.a.add(interfaceC5334bS1);
        if (!this.c) {
            interfaceC5334bS1.i();
            return;
        }
        interfaceC5334bS1.clear();
        if (Log.isLoggable(d, 2)) {
            Log.v(d, "Paused, delaying request");
        }
        this.b.add(interfaceC5334bS1);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
