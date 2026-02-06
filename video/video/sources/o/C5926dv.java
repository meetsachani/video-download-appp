package o;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import o.AbstractC3007Fx;
import o.C5926dv;

/* renamed from: o.dv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5926dv implements InterfaceC6918hx {
    public static final String r = "Camera2CameraInfo";
    public final String f;
    public final C7641kw g;
    public final C5199av h;
    public C11306zu j;
    public final a<AbstractC3007Fx> m;

    /* renamed from: o  reason: collision with root package name */
    public final C10931yL1 f717o;
    public final InterfaceC11235zc0 p;
    public final C8392nx q;
    public final Object i = new Object();
    public a<Integer> k = null;
    public a<InterfaceC9483sO2> l = null;
    public List<Pair<AbstractC3393Jv, Executor>> n = null;

    /* renamed from: o.dv$a */
    /* loaded from: classes.dex */
    public static class a<T> extends C4511Vh1<T> {
        public LiveData<T> n;

        /* renamed from: o  reason: collision with root package name */
        public final T f718o;

        public a(T t) {
            this.f718o = t;
        }

        @Override // androidx.lifecycle.LiveData
        public T f() {
            LiveData<T> liveData = this.n;
            if (liveData == null) {
                return this.f718o;
            }
            return liveData.f();
        }

        @Override // o.C4511Vh1
        public <S> void s(LiveData<S> liveData, InterfaceC3583Lt1<? super S> interfaceC3583Lt1) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void u(LiveData<T> liveData) {
            LiveData liveData2 = (LiveData<T>) this.n;
            if (liveData2 != null) {
                super.t(liveData2);
            }
            this.n = liveData;
            super.s(liveData, new InterfaceC3583Lt1() { // from class: o.cv
                @Override // o.InterfaceC3583Lt1
                public final void b(Object obj) {
                    C5926dv.a.this.r(obj);
                }
            });
        }
    }

    public C5926dv(String str, C8392nx c8392nx) throws C3197Hv {
        String str2 = (String) C10907yF1.l(str);
        this.f = str2;
        this.q = c8392nx;
        C7641kw d = c8392nx.d(str2);
        this.g = d;
        this.h = new C5199av(this);
        this.f717o = C11075yx.a(str, d);
        this.p = new C2500Av(str);
        this.m = new a<>(AbstractC3007Fx.a(AbstractC3007Fx.c.CLOSED));
    }

    public C5199av A() {
        return this.h;
    }

    public C7641kw B() {
        return this.g;
    }

    public Map<String, CameraCharacteristics> C() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.f, this.g.e());
        for (String str : this.g.b()) {
            if (!Objects.equals(str, this.f)) {
                try {
                    linkedHashMap.put(str, this.q.d(str).e());
                } catch (C3197Hv e) {
                    C7433k41.d("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e);
                }
            }
        }
        return linkedHashMap;
    }

    public int D() {
        Integer num = (Integer) this.g.a(CameraCharacteristics.SENSOR_ORIENTATION);
        C10907yF1.l(num);
        return num.intValue();
    }

    public int E() {
        Integer num = (Integer) this.g.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C10907yF1.l(num);
        return num.intValue();
    }

    public void F(C11306zu c11306zu) {
        synchronized (this.i) {
            try {
                this.j = c11306zu;
                a<InterfaceC9483sO2> aVar = this.l;
                if (aVar != null) {
                    aVar.u(c11306zu.T().j());
                }
                a<Integer> aVar2 = this.k;
                if (aVar2 != null) {
                    aVar2.u(this.j.R().f());
                }
                List<Pair<AbstractC3393Jv, Executor>> list = this.n;
                if (list != null) {
                    for (Pair<AbstractC3393Jv, Executor> pair : list) {
                        this.j.C((Executor) pair.second, (AbstractC3393Jv) pair.first);
                    }
                    this.n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G();
    }

    public final void G() {
        H();
    }

    public final void H() {
        String str;
        int E = E();
        if (E != 0) {
            if (E != 1) {
                if (E != 2) {
                    if (E != 3) {
                        if (E != 4) {
                            str = "Unknown value: " + E;
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        C7433k41.f("Camera2CameraInfo", "Device Level: " + str);
    }

    public void I(LiveData<AbstractC3007Fx> liveData) {
        this.m.u(liveData);
    }

    @Override // o.InterfaceC6918hx
    public Set<N80> a() {
        return V80.a(this.g).c();
    }

    @Override // o.InterfaceC6918hx
    public String c() {
        return this.f;
    }

    @Override // o.InterfaceC6918hx
    public void d(AbstractC3393Jv abstractC3393Jv) {
        synchronized (this.i) {
            try {
                C11306zu c11306zu = this.j;
                if (c11306zu == null) {
                    List<Pair<AbstractC3393Jv, Executor>> list = this.n;
                    if (list == null) {
                        return;
                    }
                    Iterator<Pair<AbstractC3393Jv, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().first == abstractC3393Jv) {
                            it.remove();
                        }
                    }
                    return;
                }
                c11306zu.b0(abstractC3393Jv);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC6420fx
    public LiveData<AbstractC3007Fx> e() {
        return this.m;
    }

    @Override // o.InterfaceC6420fx
    public int f() {
        return t(0);
    }

    @Override // o.InterfaceC6420fx
    public int g() {
        boolean z;
        Integer num = (Integer) this.g.a(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Unable to get the lens facing of the camera.");
        return C9277rZ0.a(num.intValue());
    }

    @Override // o.InterfaceC6420fx
    public boolean h(C2602Bw0 c2602Bw0) {
        synchronized (this.i) {
            try {
                C11306zu c11306zu = this.j;
                if (c11306zu == null) {
                    return false;
                }
                return c11306zu.J().C(c2602Bw0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC6420fx
    public Set<Range<Integer>> i() {
        Range[] rangeArr = (Range[]) this.g.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            return new HashSet(Arrays.asList(rangeArr));
        }
        return Collections.EMPTY_SET;
    }

    @Override // o.InterfaceC6918hx
    public List<Size> j(int i) {
        Size[] a2 = this.g.c().a(i);
        if (a2 != null) {
            return Arrays.asList(a2);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // o.InterfaceC6420fx
    public boolean l() {
        C7641kw c7641kw = this.g;
        Objects.requireNonNull(c7641kw);
        return C4367Tu0.a(new C5442bv(c7641kw));
    }

    @Override // o.InterfaceC6918hx
    public C10931yL1 m() {
        return this.f717o;
    }

    @Override // o.InterfaceC6918hx
    public List<Size> n(int i) {
        Size[] b = this.g.c().b(i);
        if (b != null) {
            return Arrays.asList(b);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // o.InterfaceC6420fx
    public LiveData<Integer> o() {
        synchronized (this.i) {
            try {
                C11306zu c11306zu = this.j;
                if (c11306zu == null) {
                    if (this.k == null) {
                        this.k = new a<>(0);
                    }
                    return this.k;
                }
                a<Integer> aVar = this.k;
                if (aVar != null) {
                    return aVar;
                }
                return c11306zu.R().f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC6420fx
    public boolean p() {
        return CO2.a(this.g, 4);
    }

    @Override // o.InterfaceC6420fx
    public InterfaceC9802tj0 q() {
        synchronized (this.i) {
            try {
                C11306zu c11306zu = this.j;
                if (c11306zu == null) {
                    return C9559sj0.e(this.g);
                }
                return c11306zu.I().f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC6918hx
    public EnumC5905dp2 r() {
        Integer num = (Integer) this.g.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        C10907yF1.l(num);
        if (num.intValue() != 1) {
            return EnumC5905dp2.UPTIME;
        }
        return EnumC5905dp2.REALTIME;
    }

    @Override // o.InterfaceC6420fx
    public String s() {
        if (E() == 2) {
            return InterfaceC6420fx.d;
        }
        return InterfaceC6420fx.c;
    }

    @Override // o.InterfaceC6420fx
    public int t(int i) {
        int D = D();
        int c = C10589wx.c(i);
        boolean z = true;
        if (1 != g()) {
            z = false;
        }
        return C10589wx.b(c, D, z);
    }

    @Override // o.InterfaceC6420fx
    public boolean u() {
        if (p() && X20.a(AO2.class) == null) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6918hx
    public InterfaceC11235zc0 w() {
        return this.p;
    }

    @Override // o.InterfaceC6420fx
    public LiveData<InterfaceC9483sO2> x() {
        synchronized (this.i) {
            try {
                C11306zu c11306zu = this.j;
                if (c11306zu == null) {
                    if (this.l == null) {
                        this.l = new a<>(C9240rO2.h(this.g));
                    }
                    return this.l;
                }
                a<InterfaceC9483sO2> aVar = this.l;
                if (aVar != null) {
                    return aVar;
                }
                return c11306zu.T().j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC6420fx
    public float y() {
        Integer num = (Integer) this.g.a(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            return 1.0f;
        }
        try {
            return C3988Py0.c(this.q, num.intValue()) / C3988Py0.a(C3988Py0.b(this.g), C3988Py0.d(this.g));
        } catch (Exception e) {
            C7433k41.c("Camera2CameraInfo", "The camera is unable to provide necessary information to resolve its intrinsic zoom ratio with error: " + e);
            return 1.0f;
        }
    }

    @Override // o.InterfaceC6918hx
    public void z(Executor executor, AbstractC3393Jv abstractC3393Jv) {
        synchronized (this.i) {
            try {
                C11306zu c11306zu = this.j;
                if (c11306zu == null) {
                    if (this.n == null) {
                        this.n = new ArrayList();
                    }
                    this.n.add(new Pair<>(abstractC3393Jv, executor));
                    return;
                }
                c11306zu.C(executor, abstractC3393Jv);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
