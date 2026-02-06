package o;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C3243Ih2;
import o.HJ;
import o.InterfaceC6986iD2;

/* renamed from: o.Sd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4205Sd2 {
    public static final String a = "Camera2CameraImpl";
    public static final HJ.a<Long> b = HJ.a.a("camera2.streamSpec.streamUseCase", Long.TYPE);
    public static final Map<Long, Set<InterfaceC6986iD2.b>> c;
    public static final Map<Long, Set<InterfaceC6986iD2.b>> d;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        HashMap hashMap2 = new HashMap();
        d = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            InterfaceC6986iD2.b bVar = InterfaceC6986iD2.b.PREVIEW;
            hashSet.add(bVar);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(InterfaceC6986iD2.b.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            InterfaceC6986iD2.b bVar2 = InterfaceC6986iD2.b.IMAGE_CAPTURE;
            hashSet3.add(bVar2);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            InterfaceC6986iD2.b bVar3 = InterfaceC6986iD2.b.VIDEO_CAPTURE;
            hashSet4.add(bVar3);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar2);
            hashSet5.add(bVar3);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar3);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static boolean a(Map<Integer, AbstractC8324ng> map, Map<Integer, InterfaceC6743hD2<?>> map2, List<AbstractC4609Wh2> list) {
        List<InterfaceC6986iD2.b> list2;
        InterfaceC6986iD2.b bVar;
        for (int i = 0; i < list.size(); i++) {
            long f = list.get(i).f();
            if (map.containsKey(Integer.valueOf(i))) {
                AbstractC8324ng abstractC8324ng = map.get(Integer.valueOf(i));
                if (abstractC8324ng.b().size() == 1) {
                    bVar = abstractC8324ng.b().get(0);
                } else {
                    bVar = InterfaceC6986iD2.b.STREAM_SHARING;
                }
                if (!g(bVar, f, abstractC8324ng.b())) {
                    return false;
                }
            } else if (map2.containsKey(Integer.valueOf(i))) {
                InterfaceC6743hD2<?> interfaceC6743hD2 = map2.get(Integer.valueOf(i));
                InterfaceC6986iD2.b g0 = interfaceC6743hD2.g0();
                if (interfaceC6743hD2.g0() == InterfaceC6986iD2.b.STREAM_SHARING) {
                    list2 = ((C3911Pd2) interfaceC6743hD2).r0();
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
                if (!g(g0, f, list2)) {
                    return false;
                }
            } else {
                throw new AssertionError("SurfaceConfig does not map to any use case");
            }
        }
        return true;
    }

    public static boolean b(Set<Long> set, Set<Long> set2) {
        for (Long l : set2) {
            if (!set.contains(l)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(C7641kw c7641kw, List<AbstractC4609Wh2> list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) c7641kw.a(C4105Rd2.a())) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j : jArr) {
            hashSet.add(Long.valueOf(j));
        }
        for (AbstractC4609Wh2 abstractC4609Wh2 : list) {
            if (!hashSet.contains(Long.valueOf(abstractC4609Wh2.f()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(List<AbstractC8324ng> list, List<InterfaceC6743hD2<?>> list2) {
        for (AbstractC8324ng abstractC8324ng : list) {
            if (j(abstractC8324ng.e(), abstractC8324ng.b().get(0))) {
                return true;
            }
        }
        for (InterfaceC6743hD2<?> interfaceC6743hD2 : list2) {
            if (j(interfaceC6743hD2, interfaceC6743hD2.g0())) {
                return true;
            }
        }
        return false;
    }

    public static C2598Bv e(InterfaceC6743hD2<?> interfaceC6743hD2) {
        C2569Bn1 u0 = C2569Bn1.u0();
        HJ.a<?> aVar = C2598Bv.N;
        if (interfaceC6743hD2.g(aVar)) {
            u0.h0(aVar, (Long) interfaceC6743hD2.j(aVar));
        }
        HJ.a<?> aVar2 = InterfaceC6743hD2.G;
        if (interfaceC6743hD2.g(aVar2)) {
            u0.h0(aVar2, (Boolean) interfaceC6743hD2.j(aVar2));
        }
        HJ.a<?> aVar3 = BM0.L;
        if (interfaceC6743hD2.g(aVar3)) {
            u0.h0(aVar3, (Integer) interfaceC6743hD2.j(aVar3));
        }
        HJ.a<?> aVar4 = InterfaceC5070aN0.h;
        if (interfaceC6743hD2.g(aVar4)) {
            u0.h0(aVar4, (Integer) interfaceC6743hD2.j(aVar4));
        }
        return new C2598Bv(u0);
    }

    public static HJ f(HJ hj, long j) {
        HJ.a<Long> aVar = b;
        if (hj.g(aVar) && ((Long) hj.j(aVar)).longValue() == j) {
            return null;
        }
        C2569Bn1 v0 = C2569Bn1.v0(hj);
        v0.h0(aVar, Long.valueOf(j));
        return new C2598Bv(v0);
    }

    public static boolean g(InterfaceC6986iD2.b bVar, long j, List<InterfaceC6986iD2.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar == InterfaceC6986iD2.b.STREAM_SHARING) {
            Map<Long, Set<InterfaceC6986iD2.b>> map = d;
            if (!map.containsKey(Long.valueOf(j))) {
                return false;
            }
            Set<InterfaceC6986iD2.b> set = map.get(Long.valueOf(j));
            if (list.size() != set.size()) {
                return false;
            }
            for (InterfaceC6986iD2.b bVar2 : list) {
                if (!set.contains(bVar2)) {
                    return false;
                }
            }
            return true;
        }
        Map<Long, Set<InterfaceC6986iD2.b>> map2 = c;
        if (!map2.containsKey(Long.valueOf(j)) || !map2.get(Long.valueOf(j)).contains(bVar)) {
            return false;
        }
        return true;
    }

    public static boolean h(C7641kw c7641kw) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) c7641kw.a(C4105Rd2.a())) == null || jArr.length == 0) {
            return false;
        }
        return true;
    }

    public static boolean i(List<AbstractC8324ng> list, List<InterfaceC6743hD2<?>> list2, Set<Long> set) {
        boolean z;
        boolean z2;
        HashSet hashSet = new HashSet();
        Iterator<AbstractC8324ng> it = list.iterator();
        if (it.hasNext()) {
            AbstractC8324ng next = it.next();
            HJ e = next.e();
            HJ.a<Long> aVar = C2598Bv.N;
            if (!e.g(aVar) || ((Long) next.e().j(aVar)).longValue() == 0) {
                z2 = true;
                z = false;
            } else {
                z = true;
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        for (InterfaceC6743hD2<?> interfaceC6743hD2 : list2) {
            HJ.a<?> aVar2 = C2598Bv.N;
            if (!interfaceC6743hD2.g(aVar2)) {
                if (z) {
                    o();
                }
            } else {
                Long l = (Long) interfaceC6743hD2.j(aVar2);
                if (l.longValue() == 0) {
                    if (z) {
                        o();
                    }
                } else {
                    if (z2) {
                        o();
                    }
                    hashSet.add(l);
                    z = true;
                }
            }
            z2 = true;
        }
        if (!z2 && b(set, hashSet)) {
            return true;
        }
        return false;
    }

    public static boolean j(HJ hj, InterfaceC6986iD2.b bVar) {
        if (((Boolean) hj.h(InterfaceC6743hD2.G, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        HJ.a<Integer> aVar = BM0.L;
        if (!hj.g(aVar) || C7361jm2.b(bVar, ((Integer) hj.j(aVar)).intValue()) != 5) {
            return false;
        }
        return true;
    }

    public static boolean k(C7641kw c7641kw, List<AbstractC8324ng> list, Map<InterfaceC6743hD2<?>, AbstractC4008Qd2> map, Map<AbstractC8324ng, AbstractC4008Qd2> map2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<InterfaceC6743hD2> arrayList = new ArrayList(map.keySet());
        for (AbstractC8324ng abstractC8324ng : list) {
            C10907yF1.l(abstractC8324ng.e());
        }
        for (InterfaceC6743hD2 interfaceC6743hD2 : arrayList) {
            C10907yF1.l(((AbstractC4008Qd2) C10907yF1.l(map.get(interfaceC6743hD2))).d());
        }
        long[] jArr = (long[]) c7641kw.a(C4105Rd2.a());
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j : jArr) {
                hashSet.add(Long.valueOf(j));
            }
            if (i(list, arrayList, hashSet)) {
                for (AbstractC8324ng abstractC8324ng2 : list) {
                    HJ e = abstractC8324ng2.e();
                    HJ f = f(e, ((Long) e.j(C2598Bv.N)).longValue());
                    if (f != null) {
                        map2.put(abstractC8324ng2, abstractC8324ng2.i(f));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC6743hD2<?> interfaceC6743hD22 = (InterfaceC6743hD2) it.next();
                    AbstractC4008Qd2 abstractC4008Qd2 = map.get(interfaceC6743hD22);
                    HJ d2 = abstractC4008Qd2.d();
                    HJ f2 = f(d2, ((Long) d2.j(C2598Bv.N)).longValue());
                    if (f2 != null) {
                        map.put(interfaceC6743hD22, abstractC4008Qd2.f().d(f2).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void l(Map<InterfaceC6743hD2<?>, AbstractC4008Qd2> map, Map<AbstractC8324ng, AbstractC4008Qd2> map2, Map<Integer, AbstractC8324ng> map3, Map<Integer, InterfaceC6743hD2<?>> map4, List<AbstractC4609Wh2> list) {
        for (int i = 0; i < list.size(); i++) {
            long f = list.get(i).f();
            if (map3.containsKey(Integer.valueOf(i))) {
                AbstractC8324ng abstractC8324ng = map3.get(Integer.valueOf(i));
                HJ f2 = f(abstractC8324ng.e(), f);
                if (f2 != null) {
                    map2.put(abstractC8324ng, abstractC8324ng.i(f2));
                }
            } else if (map4.containsKey(Integer.valueOf(i))) {
                InterfaceC6743hD2<?> interfaceC6743hD2 = map4.get(Integer.valueOf(i));
                AbstractC4008Qd2 abstractC4008Qd2 = map.get(interfaceC6743hD2);
                HJ f3 = f(abstractC4008Qd2.d(), f);
                if (f3 != null) {
                    map.put(interfaceC6743hD2, abstractC4008Qd2.f().d(f3).a());
                }
            } else {
                throw new AssertionError("SurfaceConfig does not map to any use case");
            }
        }
    }

    public static void m(Collection<T12> collection, Collection<InterfaceC6743hD2<?>> collection2, Map<D10, Long> map) {
        ArrayList arrayList = new ArrayList(collection2);
        for (T12 t12 : collection) {
            HJ e = t12.e();
            HJ.a<Long> aVar = b;
            if (e.g(aVar) && t12.l().size() != 1) {
                C7433k41.c("Camera2CameraImpl", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(t12.l().size())));
                return;
            } else if (t12.e().g(aVar)) {
                int i = 0;
                for (T12 t122 : collection) {
                    if (((InterfaceC6743hD2) arrayList.get(i)).g0() == InterfaceC6986iD2.b.METERING_REPEATING) {
                        map.put(t122.l().get(0), 1L);
                    } else {
                        HJ e2 = t122.e();
                        HJ.a<Long> aVar2 = b;
                        if (e2.g(aVar2)) {
                            map.put(t122.l().get(0), (Long) t122.e().j(aVar2));
                        }
                    }
                    i++;
                }
                return;
            }
        }
    }

    public static boolean n(C3243Ih2.b bVar) {
        if (bVar.a() == 0 && bVar.b() == 8) {
            return true;
        }
        return false;
    }

    public static void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
