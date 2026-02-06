package o;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC7753lN2;

/* renamed from: o.yv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11069yv1 extends AbstractC7753lN2 {
    public C11069yv1(a builder) {
        super(builder.b, builder.c, builder.d);
    }

    public static List<C11069yv1> e(List<Class<? extends ListenableWorker>> workerClasses) {
        ArrayList arrayList = new ArrayList(workerClasses.size());
        for (Class<? extends ListenableWorker> cls : workerClasses) {
            arrayList.add(new a(cls).b());
        }
        return arrayList;
    }

    public static C11069yv1 f(Class<? extends ListenableWorker> workerClass) {
        return new a(workerClass).b();
    }

    /* renamed from: o.yv1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC7753lN2.a<a, C11069yv1> {
        public a(Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            this.c.d = OverwritingInputMerger.class.getName();
        }

        @Override // o.AbstractC7753lN2.a
        /* renamed from: r */
        public C11069yv1 c() {
            if (this.a && this.c.j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new C11069yv1(this);
        }

        public a t(Class<? extends AbstractC7036iQ0> inputMerger) {
            this.c.d = inputMerger.getName();
            return this;
        }

        @Override // o.AbstractC7753lN2.a
        /* renamed from: s */
        public a d() {
            return this;
        }
    }
}
