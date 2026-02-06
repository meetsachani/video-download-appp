package o;

import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public class J11 {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* loaded from: classes.dex */
    public class a<In> implements InterfaceC3583Lt1<In> {
        public Out a = null;
        public final /* synthetic */ InterfaceC3748Nl2 b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ InterfaceC6490gB0 d;
        public final /* synthetic */ C4511Vh1 e;

        /* renamed from: o.J11$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0192a implements Runnable {
            public final /* synthetic */ Object X;

            public RunnableC0192a(final Object val$input) {
                this.X = val$input;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Out] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.c) {
                    try {
                        ?? apply = a.this.d.apply(this.X);
                        a aVar = a.this;
                        Out out = aVar.a;
                        if (out == 0 && apply != 0) {
                            aVar.a = apply;
                            aVar.e.o(apply);
                        } else if (out != 0 && !out.equals(apply)) {
                            a aVar2 = a.this;
                            aVar2.a = apply;
                            aVar2.e.o(apply);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public a(final InterfaceC3748Nl2 val$workTaskExecutor, final Object val$lock, final InterfaceC6490gB0 val$mappingMethod, final C4511Vh1 val$outputLiveData) {
            this.b = val$workTaskExecutor;
            this.c = val$lock;
            this.d = val$mappingMethod;
            this.e = val$outputLiveData;
        }

        @Override // o.InterfaceC3583Lt1
        public void b(final In input) {
            this.b.o(new RunnableC0192a(input));
        }
    }

    public static <In, Out> LiveData<Out> a(LiveData<In> inputLiveData, final InterfaceC6490gB0<In, Out> mappingMethod, final InterfaceC3748Nl2 workTaskExecutor) {
        Object obj = new Object();
        C4511Vh1 c4511Vh1 = new C4511Vh1();
        c4511Vh1.s(inputLiveData, new a(workTaskExecutor, obj, mappingMethod, c4511Vh1));
        return c4511Vh1;
    }
}
