package o;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.impl.workers.CombineContinuationsWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.C11069yv1;

/* loaded from: classes.dex */
public class PM2 extends OM2 {
    public static final String j = AbstractC6949i41.f("WorkContinuationImpl");
    public final ZM2 a;
    public final String b;
    public final EnumC3433Kg0 c;
    public final List<? extends AbstractC7753lN2> d;
    public final List<String> e;
    public final List<String> f;
    public final List<PM2> g;
    public boolean h;
    public InterfaceC3395Jv1 i;

    public PM2(ZM2 workManagerImpl, List<? extends AbstractC7753lN2> work) {
        this(workManagerImpl, null, EnumC3433Kg0.KEEP, work, null);
    }

    public static boolean p(PM2 continuation, Set<String> visited) {
        visited.addAll(continuation.j());
        Set<String> s = s(continuation);
        for (String str : visited) {
            if (s.contains(str)) {
                return true;
            }
        }
        List<PM2> l = continuation.l();
        if (l != null && !l.isEmpty()) {
            for (PM2 pm2 : l) {
                if (p(pm2, visited)) {
                    return true;
                }
            }
        }
        visited.removeAll(continuation.j());
        return false;
    }

    public static Set<String> s(PM2 continuation) {
        HashSet hashSet = new HashSet();
        List<PM2> l = continuation.l();
        if (l != null && !l.isEmpty()) {
            for (PM2 pm2 : l) {
                hashSet.addAll(pm2.j());
            }
        }
        return hashSet;
    }

    @Override // o.OM2
    public OM2 b(List<OM2> continuations) {
        C11069yv1 b = new C11069yv1.a(CombineContinuationsWorker.class).t(ArrayCreatingInputMerger.class).b();
        ArrayList arrayList = new ArrayList(continuations.size());
        Iterator<OM2> it = continuations.iterator();
        while (it.hasNext()) {
            arrayList.add((PM2) it.next());
        }
        return new PM2(this.a, null, EnumC3433Kg0.KEEP, Collections.singletonList(b), arrayList);
    }

    @Override // o.OM2
    public InterfaceC3395Jv1 c() {
        if (!this.h) {
            RunnableC5856dd0 runnableC5856dd0 = new RunnableC5856dd0(this);
            this.a.O().o(runnableC5856dd0);
            this.i = runnableC5856dd0.d();
        } else {
            AbstractC6949i41.c().h(j, String.format("Already enqueued work ids (%s)", TextUtils.join(C6566gU0.h, this.e)), new Throwable[0]);
        }
        return this.i;
    }

    @Override // o.OM2
    public InterfaceFutureC8411o11<List<TM2>> d() {
        AbstractRunnableC4201Sc2<List<TM2>> a = AbstractRunnableC4201Sc2.a(this.a, this.f);
        this.a.O().o(a);
        return a.f();
    }

    @Override // o.OM2
    public LiveData<List<TM2>> e() {
        return this.a.N(this.f);
    }

    @Override // o.OM2
    public OM2 f(List<C11069yv1> work) {
        if (work.isEmpty()) {
            return this;
        }
        return new PM2(this.a, this.b, EnumC3433Kg0.KEEP, work, Collections.singletonList(this));
    }

    public List<String> h() {
        return this.f;
    }

    public EnumC3433Kg0 i() {
        return this.c;
    }

    public List<String> j() {
        return this.e;
    }

    public String k() {
        return this.b;
    }

    public List<PM2> l() {
        return this.g;
    }

    public List<? extends AbstractC7753lN2> m() {
        return this.d;
    }

    public ZM2 n() {
        return this.a;
    }

    public boolean o() {
        return p(this, new HashSet());
    }

    public boolean q() {
        return this.h;
    }

    public void r() {
        this.h = true;
    }

    public PM2(ZM2 workManagerImpl, String name, EnumC3433Kg0 existingWorkPolicy, List<? extends AbstractC7753lN2> work) {
        this(workManagerImpl, name, existingWorkPolicy, work, null);
    }

    public PM2(ZM2 workManagerImpl, String name, EnumC3433Kg0 existingWorkPolicy, List<? extends AbstractC7753lN2> work, List<PM2> parents) {
        this.a = workManagerImpl;
        this.b = name;
        this.c = existingWorkPolicy;
        this.d = work;
        this.g = parents;
        this.e = new ArrayList(work.size());
        this.f = new ArrayList();
        if (parents != null) {
            for (PM2 pm2 : parents) {
                this.f.addAll(pm2.f);
            }
        }
        for (int i = 0; i < work.size(); i++) {
            String b = work.get(i).b();
            this.e.add(b);
            this.f.add(b);
        }
    }
}
