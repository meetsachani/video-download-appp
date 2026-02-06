package o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC4008Qd2;
import o.AbstractC4609Wh2;

/* renamed from: o.Ih2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3243Ih2 {
    public static final String w = "SupportedSurfaceCombination";
    public final String g;
    public final InterfaceC4751Xt h;
    public final C7641kw i;
    public final C4127Rj0 j;
    public final int k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f498o;
    public boolean p;
    public AbstractC3149Hi2 q;
    public final C10376w40 s;
    public final R80 v;
    public final List<C4512Vh2> a = new ArrayList();
    public final List<C4512Vh2> b = new ArrayList();
    public final List<C4512Vh2> c = new ArrayList();
    public final Map<b, List<C4512Vh2>> d = new HashMap();
    public final List<C4512Vh2> e = new ArrayList();
    public final List<C4512Vh2> f = new ArrayList();
    public List<Integer> r = new ArrayList();
    public final C2965Fl2 t = new C2965Fl2();
    public final RS1 u = new RS1();

    /* renamed from: o.Ih2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    /* renamed from: o.Ih2$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static b c(int i, int i2) {
            return new C10044uj(i, i2);
        }

        public abstract int a();

        public abstract int b();
    }

    public C3243Ih2(Context context, String str, C8392nx c8392nx, InterfaceC4751Xt interfaceC4751Xt) throws C3594Lx {
        int i;
        this.l = false;
        this.m = false;
        this.n = false;
        this.f498o = false;
        this.p = false;
        String str2 = (String) C10907yF1.l(str);
        this.g = str2;
        this.h = (InterfaceC4751Xt) C10907yF1.l(interfaceC4751Xt);
        this.j = new C4127Rj0();
        this.s = C10376w40.c(context);
        try {
            C7641kw d = c8392nx.d(str2);
            this.i = d;
            Integer num = (Integer) d.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            this.k = i;
            int[] iArr = (int[]) d.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 3) {
                        this.l = true;
                    } else if (i2 == 6) {
                        this.m = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i2 == 16) {
                        this.p = true;
                    }
                }
            }
            R80 r80 = new R80(this.i);
            this.v = r80;
            j();
            if (this.p) {
                l();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.n = hasSystemFeature;
            if (hasSystemFeature) {
                h();
            }
            if (r80.d()) {
                g();
            }
            boolean h = C4205Sd2.h(this.i);
            this.f498o = h;
            if (h) {
                i();
            }
            k();
            b();
        } catch (C3197Hv e) {
            throw C3692Mx.a(e);
        }
    }

    public static Range<Integer> d(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        int i;
        double u = u(range2.intersect(range));
        double u2 = u(range3.intersect(range));
        double u3 = u2 / u(range3);
        double u4 = u / u(range2);
        int i2 = (u2 > u ? 1 : (u2 == u ? 0 : -1));
        if (i2 <= 0 ? !(i2 != 0 ? u4 >= 0.5d || u3 <= u4 : u3 <= u4 && (i != 0 || range3.getLower().intValue() <= range2.getLower().intValue())) : !(u3 < 0.5d && u3 < u4)) {
            return range3;
        }
        return range2;
    }

    public static int p(C7641kw c7641kw, int i, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) c7641kw.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int t(Range<Integer> range, Range<Integer> range2) {
        boolean z;
        if (!range.contains((Range<Integer>) range2.getUpper()) && !range.contains((Range<Integer>) range2.getLower())) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "Ranges must not intersect");
        if (range.getLower().intValue() > range2.getUpper().intValue()) {
            return range.getLower().intValue() - range2.getUpper().intValue();
        }
        return range2.getLower().intValue() - range.getUpper().intValue();
    }

    public static int u(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    public static int y(Map<InterfaceC6743hD2<?>, N80> map) {
        for (N80 n80 : map.values()) {
            if (n80.a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    public final List<C4512Vh2> A(b bVar) {
        if (this.d.containsKey(bVar)) {
            return this.d.get(bVar);
        }
        List<C4512Vh2> arrayList = new ArrayList<>();
        if (bVar.b() == 8) {
            int a2 = bVar.a();
            if (a2 != 1) {
                if (a2 != 2) {
                    arrayList.addAll(this.a);
                } else {
                    arrayList.addAll(this.b);
                    arrayList.addAll(this.a);
                }
            } else {
                arrayList = this.c;
            }
        } else if (bVar.b() == 10 && bVar.a() == 0) {
            arrayList.addAll(this.e);
        }
        this.d.put(bVar, arrayList);
        return arrayList;
    }

    public final Pair<List<AbstractC4609Wh2>, Integer> B(int i, List<AbstractC8324ng> list, List<Size> list2, List<InterfaceC6743hD2<?>> list3, List<Integer> list4, int i2, Map<Integer, AbstractC8324ng> map, Map<Integer, InterfaceC6743hD2<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC8324ng abstractC8324ng : list) {
            arrayList.add(abstractC8324ng.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC8324ng);
            }
        }
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Size size = list2.get(i3);
            InterfaceC6743hD2<?> interfaceC6743hD2 = list3.get(list4.get(i3).intValue());
            int t = interfaceC6743hD2.t();
            arrayList.add(AbstractC4609Wh2.h(i, t, size, E(t)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), interfaceC6743hD2);
            }
            i2 = D(i2, interfaceC6743hD2.t(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i2));
    }

    public final Range<Integer> C(List<AbstractC8324ng> list, List<InterfaceC6743hD2<?>> list2, List<Integer> list3) {
        Range<Integer> range = null;
        for (AbstractC8324ng abstractC8324ng : list) {
            range = F(abstractC8324ng.h(), range);
        }
        for (Integer num : list3) {
            range = F(list2.get(num.intValue()).E(null), range);
        }
        return range;
    }

    public final int D(int i, int i2, Size size) {
        return Math.min(i, p(this.i, i2, size));
    }

    public AbstractC3149Hi2 E(int i) {
        if (!this.r.contains(Integer.valueOf(i))) {
            N(this.q.j(), W82.e, i);
            N(this.q.h(), W82.g, i);
            M(this.q.d(), i);
            O(this.q.l(), i);
            this.r.add(Integer.valueOf(i));
        }
        return this.q;
    }

    public final Range<Integer> F(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    public final List<Integer> G(List<InterfaceC6743hD2<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        for (InterfaceC6743hD2<?> interfaceC6743hD2 : list) {
            int H = interfaceC6743hD2.H(0);
            if (!arrayList2.contains(Integer.valueOf(H))) {
                arrayList2.add(Integer.valueOf(H));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer num : arrayList2) {
            int intValue = num.intValue();
            for (InterfaceC6743hD2<?> interfaceC6743hD22 : list) {
                if (intValue == interfaceC6743hD22.H(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(interfaceC6743hD22)));
                }
            }
        }
        return arrayList;
    }

    public boolean H() {
        return this.m;
    }

    public boolean I() {
        return this.l;
    }

    public final boolean J(b bVar, List<AbstractC8324ng> list, Map<InterfaceC6743hD2<?>, List<Size>> map) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (AbstractC8324ng abstractC8324ng : list) {
            arrayList.add(abstractC8324ng.g());
        }
        C8474oH c8474oH = new C8474oH();
        for (InterfaceC6743hD2<?> interfaceC6743hD2 : map.keySet()) {
            List<Size> list2 = map.get(interfaceC6743hD2);
            if (list2 != null && !list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.b(z, "No available output size is found for " + interfaceC6743hD2 + UE.h);
            int t = interfaceC6743hD2.t();
            arrayList.add(AbstractC4609Wh2.h(bVar.a(), t, (Size) Collections.min(list2, c8474oH), E(t)));
        }
        return c(bVar, arrayList);
    }

    public final void K() {
        this.s.g();
        if (this.q == null) {
            k();
            return;
        }
        this.q = AbstractC3149Hi2.a(this.q.b(), this.q.j(), this.s.f(), this.q.h(), this.q.f(), this.q.d(), this.q.l());
    }

    public AbstractC4609Wh2 L(int i, int i2, Size size) {
        return AbstractC4609Wh2.h(i, i2, size, E(i2));
    }

    public final void M(Map<Integer, Size> map, int i) {
        Size q = q(this.i.c().d(), i, true);
        if (q != null) {
            map.put(Integer.valueOf(i), q);
        }
    }

    public final void N(Map<Integer, Size> map, Size size, int i) {
        if (!this.n) {
            return;
        }
        Size q = q(this.i.c().d(), i, false);
        Integer valueOf = Integer.valueOf(i);
        if (q != null) {
            size = (Size) Collections.min(Arrays.asList(size, q), new C8474oH());
        }
        map.put(valueOf, size);
    }

    public final void O(Map<Integer, Size> map, int i) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 31 && this.p) {
            C7641kw c7641kw = this.i;
            key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c7641kw.a(key);
            if (streamConfigurationMap != null) {
                map.put(Integer.valueOf(i), q(streamConfigurationMap, i, true));
            }
        }
    }

    public List<Size> a(List<Size> list, int i) {
        Rational rational;
        int a2 = this.t.a(this.g, this.i);
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 != 2) {
                    rational = null;
                } else {
                    Size c = E(256).c(256);
                    rational = new Rational(c.getWidth(), c.getHeight());
                }
            } else {
                rational = C9050qf.c;
            }
        } else {
            rational = C9050qf.a;
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (C9050qf.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.u.a(AbstractC4609Wh2.e(i), list);
    }

    public boolean c(b bVar, List<AbstractC4609Wh2> list) {
        boolean z = false;
        for (C4512Vh2 c4512Vh2 : A(bVar)) {
            if (c4512Vh2.d(list) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    public final b e(int i, Map<InterfaceC6743hD2<?>, N80> map) {
        int y = y(map);
        if (i != 0 && y == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.g, C9614sx.a(i)));
        }
        return b.c(i, y);
    }

    public final Map<InterfaceC6743hD2<?>, List<Size>> f(Map<InterfaceC6743hD2<?>, List<Size>> map, b bVar, Range<Integer> range) {
        int i;
        HashMap hashMap = new HashMap();
        for (InterfaceC6743hD2<?> interfaceC6743hD2 : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            for (Size size : map.get(interfaceC6743hD2)) {
                int t = interfaceC6743hD2.t();
                AbstractC4609Wh2.a c = AbstractC4609Wh2.h(bVar.a(), t, size, E(t)).c();
                if (range != null) {
                    i = p(this.i, t, size);
                } else {
                    i = Integer.MAX_VALUE;
                }
                Set set = (Set) hashMap2.get(c);
                if (set == null) {
                    set = new HashSet();
                    hashMap2.put(c, set);
                }
                if (!set.contains(Integer.valueOf(i))) {
                    arrayList.add(size);
                    set.add(Integer.valueOf(i));
                }
            }
            hashMap.put(interfaceC6743hD2, arrayList);
        }
        return hashMap;
    }

    public final void g() {
        this.e.addAll(C7476kF0.b());
    }

    public final void h() {
        this.c.addAll(C7476kF0.d());
    }

    public final void i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f.addAll(C7476kF0.j());
        }
    }

    public final void j() {
        this.a.addAll(C7476kF0.a(this.k, this.l, this.m));
        this.a.addAll(this.j.a(this.g, this.k));
    }

    public final void k() {
        this.q = AbstractC3149Hi2.a(W82.c, new HashMap(), this.s.f(), new HashMap(), v(), new HashMap(), new HashMap());
    }

    public final void l() {
        this.b.addAll(C7476kF0.k());
    }

    public final List<List<Size>> m(List<List<Size>> list) {
        int i = 1;
        for (List<Size> list2 : list) {
            i *= list2.size();
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new ArrayList());
            }
            int size = i / list.get(0).size();
            int i3 = i;
            for (int i4 = 0; i4 < list.size(); i4++) {
                List<Size> list3 = list.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    ((List) arrayList.get(i5)).add(list3.get((i5 % i3) / size));
                }
                if (i4 < list.size() - 1) {
                    i3 = size;
                    size /= list.get(i4 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    public String n() {
        return this.g;
    }

    public final Range<Integer> o(Range<Integer> range, int i) {
        if (range != null) {
            Range<Integer> range2 = AbstractC4008Qd2.a;
            if (!range.equals(range2)) {
                Range<Integer>[] rangeArr = (Range[]) this.i.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return range2;
                }
                Range<Integer> range3 = new Range<>(Integer.valueOf(Math.min(range.getLower().intValue(), i)), Integer.valueOf(Math.min(range.getUpper().intValue(), i)));
                int i2 = 0;
                for (Range<Integer> range4 : rangeArr) {
                    if (i >= range4.getLower().intValue()) {
                        if (range2.equals(AbstractC4008Qd2.a)) {
                            range2 = range4;
                        }
                        if (range4.equals(range3)) {
                            return range4;
                        }
                        try {
                            int u = u(range4.intersect(range3));
                            if (i2 == 0) {
                                i2 = u;
                            } else {
                                if (u >= i2) {
                                    range2 = d(range3, range2, range4);
                                    i2 = u(range3.intersect(range2));
                                }
                                range4 = range2;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (i2 == 0) {
                                if (t(range4, range3) >= t(range2, range3)) {
                                    if (t(range4, range3) == t(range2, range3)) {
                                        if (range4.getLower().intValue() <= range2.getUpper().intValue() && u(range4) >= u(range2)) {
                                        }
                                    }
                                }
                            }
                        }
                        range2 = range4;
                    }
                }
                return range2;
            }
        }
        return AbstractC4008Qd2.a;
    }

    public final Size q(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] outputSizes;
        Size[] a2;
        if (i == 34) {
            outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(i);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            C8474oH c8474oH = new C8474oH();
            Size size = (Size) Collections.max(Arrays.asList(outputSizes), c8474oH);
            Size size2 = W82.a;
            if (z && (a2 = a.a(streamConfigurationMap, i)) != null && a2.length > 0) {
                size2 = (Size) Collections.max(Arrays.asList(a2), c8474oH);
            }
            return (Size) Collections.max(Arrays.asList(size, size2), c8474oH);
        }
        return null;
    }

    public final int r(List<AbstractC8324ng> list) {
        int i = Integer.MAX_VALUE;
        for (AbstractC8324ng abstractC8324ng : list) {
            i = D(i, abstractC8324ng.d(), abstractC8324ng.f());
        }
        return i;
    }

    public List<AbstractC4609Wh2> s(b bVar, List<AbstractC4609Wh2> list) {
        if (!C4205Sd2.n(bVar)) {
            return null;
        }
        for (C4512Vh2 c4512Vh2 : this.f) {
            List<AbstractC4609Wh2> d = c4512Vh2.d(list);
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    public final Size v() {
        CamcorderProfile camcorderProfile;
        try {
            int parseInt = Integer.parseInt(this.g);
            if (this.h.b(parseInt, 1)) {
                camcorderProfile = this.h.a(parseInt, 1);
            } else {
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            return w(parseInt);
        } catch (NumberFormatException unused) {
            return x();
        }
    }

    public final Size w(int i) {
        CamcorderProfile camcorderProfile;
        Size size = W82.d;
        if (this.h.b(i, 10)) {
            camcorderProfile = this.h.a(i, 10);
        } else if (this.h.b(i, 8)) {
            camcorderProfile = this.h.a(i, 8);
        } else if (this.h.b(i, 12)) {
            camcorderProfile = this.h.a(i, 12);
        } else if (this.h.b(i, 6)) {
            camcorderProfile = this.h.a(i, 6);
        } else if (this.h.b(i, 5)) {
            camcorderProfile = this.h.a(i, 5);
        } else if (this.h.b(i, 4)) {
            camcorderProfile = this.h.a(i, 4);
        } else {
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        return size;
    }

    public final Size x() {
        Size[] outputSizes = this.i.c().d().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return W82.d;
        }
        Arrays.sort(outputSizes, new C8474oH(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = W82.f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return W82.d;
    }

    public Pair<Map<InterfaceC6743hD2<?>, AbstractC4008Qd2>, Map<AbstractC8324ng, AbstractC4008Qd2>> z(int i, List<AbstractC8324ng> list, Map<InterfaceC6743hD2<?>, List<Size>> map) {
        int i2;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        List<AbstractC4609Wh2> list2;
        HashMap hashMap4;
        List<AbstractC4609Wh2> list3;
        String str;
        String str2;
        int i3;
        HashMap hashMap5;
        List<Size> list4;
        List<Size> list5;
        HashMap hashMap6;
        boolean z;
        K();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> G = G(arrayList);
        Map<InterfaceC6743hD2<?>, N80> g = this.v.g(list, arrayList, G);
        int i4 = i;
        b e = e(i4, g);
        boolean J = J(e, list, map);
        String str3 = " New configs: ";
        String str4 = "No supported surface combination is found for camera device - Id : ";
        if (!J) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.g + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range<Integer> C = C(list, arrayList, G);
        Map<InterfaceC6743hD2<?>, List<Size>> f = f(map, e, C);
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : G) {
            InterfaceC6743hD2<?> interfaceC6743hD2 = arrayList.get(num.intValue());
            arrayList2.add(a(f.get(interfaceC6743hD2), interfaceC6743hD2.t()));
            f = f;
        }
        List<List<Size>> m = m(arrayList2);
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        HashMap hashMap9 = new HashMap();
        HashMap hashMap10 = new HashMap();
        boolean d = C4205Sd2.d(list, arrayList);
        HashMap hashMap11 = hashMap8;
        int r = r(list);
        if (!this.f498o || d) {
            i2 = r;
            hashMap = hashMap9;
            hashMap2 = hashMap10;
            hashMap3 = hashMap11;
            list2 = null;
        } else {
            Iterator<List<Size>> it = m.iterator();
            List<AbstractC4609Wh2> list6 = null;
            while (true) {
                if (!it.hasNext()) {
                    HashMap hashMap12 = hashMap10;
                    i2 = r;
                    hashMap = hashMap9;
                    hashMap2 = hashMap12;
                    z = J;
                    hashMap3 = hashMap11;
                    break;
                }
                z = J;
                hashMap3 = hashMap11;
                Pair<List<AbstractC4609Wh2>, Integer> B = B(i4, list, it.next(), arrayList, G, r, hashMap9, hashMap10);
                HashMap hashMap13 = hashMap10;
                i2 = r;
                hashMap = hashMap9;
                hashMap2 = hashMap13;
                list6 = s(e, (List) B.first);
                if (list6 != null && !C4205Sd2.a(hashMap, hashMap2, list6)) {
                    list6 = null;
                }
                if (list6 != null) {
                    if (C4205Sd2.c(this.i, list6)) {
                        break;
                    }
                    list6 = null;
                }
                hashMap.clear();
                hashMap2.clear();
                hashMap9 = hashMap;
                r = i2;
                hashMap10 = hashMap2;
                i4 = i;
                hashMap11 = hashMap3;
                J = z;
            }
            if (list6 == null && !z) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.g + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
            }
            list2 = list6;
        }
        Iterator<List<Size>> it2 = m.iterator();
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        boolean z2 = false;
        boolean z3 = false;
        List<Size> list7 = null;
        List<Size> list8 = null;
        while (true) {
            if (!it2.hasNext()) {
                hashMap4 = hashMap2;
                list3 = list2;
                str = str3;
                str2 = str4;
                i3 = i7;
                hashMap5 = hashMap;
                list4 = list7;
                break;
            }
            List<Size> next = it2.next();
            HashMap hashMap14 = hashMap;
            int i8 = i2;
            str = str3;
            hashMap4 = hashMap2;
            int i9 = i6;
            list3 = list2;
            int i10 = i5;
            str2 = str4;
            hashMap5 = hashMap14;
            Pair<List<AbstractC4609Wh2>, Integer> B2 = B(i, list, next, arrayList, G, i8, null, null);
            List<AbstractC4609Wh2> list9 = (List) B2.first;
            int intValue = ((Integer) B2.second).intValue();
            boolean z4 = C == null || i8 <= intValue || intValue >= C.getLower().intValue();
            if (!z2 && c(e, list9)) {
                if (i9 == i10 || i9 < intValue) {
                    list7 = next;
                    i9 = intValue;
                }
                if (z4) {
                    if (z3) {
                        list4 = next;
                        i6 = intValue;
                        i3 = i7;
                        break;
                    }
                    list7 = next;
                    i9 = intValue;
                    z2 = true;
                }
            }
            if (list3 == null || z3 || s(e, list9) == null) {
                i7 = i7;
            } else {
                int i11 = i7;
                if (i11 != i10 && i11 >= intValue) {
                    i7 = i11;
                } else {
                    list8 = next;
                    i7 = intValue;
                }
                if (!z4) {
                    continue;
                } else if (z2) {
                    i3 = intValue;
                    list4 = list7;
                    list5 = next;
                    i6 = i9;
                    break;
                } else {
                    list8 = next;
                    i7 = intValue;
                    z3 = true;
                }
            }
            i2 = i8;
            i5 = i10;
            i6 = i9;
            hashMap = hashMap5;
            str4 = str2;
            list2 = list3;
            str3 = str;
            hashMap2 = hashMap4;
        }
        list5 = list8;
        if (list4 != null) {
            Range<Integer> o2 = C != null ? o(C, i6) : null;
            for (InterfaceC6743hD2<?> interfaceC6743hD22 : arrayList) {
                AbstractC4008Qd2.a d2 = AbstractC4008Qd2.a(list4.get(G.indexOf(Integer.valueOf(arrayList.indexOf(interfaceC6743hD22))))).b((N80) C10907yF1.l(g.get(interfaceC6743hD22))).d(C4205Sd2.e(interfaceC6743hD22));
                if (o2 != null) {
                    d2.c(o2);
                }
                hashMap3.put(interfaceC6743hD22, d2.a());
            }
            if (list3 != null && i6 == i3 && list4.size() == list5.size()) {
                for (int i12 = 0; i12 < list4.size(); i12++) {
                    if (list4.get(i12).equals(list5.get(i12))) {
                    }
                }
                hashMap6 = hashMap7;
                if (!C4205Sd2.k(this.i, list, hashMap3, hashMap6)) {
                    C4205Sd2.l(hashMap3, hashMap6, hashMap5, hashMap4, list3);
                }
                return new Pair<>(hashMap3, hashMap6);
            }
            hashMap6 = hashMap7;
            return new Pair<>(hashMap3, hashMap6);
        }
        throw new IllegalArgumentException(str2 + this.g + " and Hardware level: " + this.k + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str + arrayList);
    }

    public final void b() {
    }
}
