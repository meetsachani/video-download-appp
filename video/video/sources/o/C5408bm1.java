package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.FE1;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* renamed from: o.bm1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5408bm1<Model, Data> implements InterfaceC7595kk1<Model, Data> {
    public final List<InterfaceC7595kk1<Model, Data>> a;
    public final FE1.a<List<Throwable>> b;

    /* renamed from: o.bm1$a */
    /* loaded from: classes.dex */
    public static class a<Data> implements InterfaceC9990uU<Data>, InterfaceC9990uU.a<Data> {
        public final List<InterfaceC9990uU<Data>> X;
        public final FE1.a<List<Throwable>> Y;
        public EnumC10672xH1 Y0;
        public int Z;
        public InterfaceC9990uU.a<? super Data> Z0;
        public List<Throwable> a1;
        public boolean b1;

        public a(List<InterfaceC9990uU<Data>> list, FE1.a<List<Throwable>> aVar) {
            this.Y = aVar;
            C10175vF1.d(list);
            this.X = list;
            this.Z = 0;
        }

        @Override // o.InterfaceC9990uU
        public Class<Data> a() {
            return this.X.get(0).a();
        }

        @Override // o.InterfaceC9990uU
        public void b() {
            List<Throwable> list = this.a1;
            if (list != null) {
                this.Y.b(list);
            }
            this.a1 = null;
            for (InterfaceC9990uU<Data> interfaceC9990uU : this.X) {
                interfaceC9990uU.b();
            }
        }

        @Override // o.InterfaceC9990uU.a
        public void c(Exception exc) {
            ((List) C10175vF1.e(this.a1)).add(exc);
            g();
        }

        @Override // o.InterfaceC9990uU
        public void cancel() {
            this.b1 = true;
            for (InterfaceC9990uU<Data> interfaceC9990uU : this.X) {
                interfaceC9990uU.cancel();
            }
        }

        @Override // o.InterfaceC9990uU
        public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super Data> aVar) {
            this.Y0 = enumC10672xH1;
            this.Z0 = aVar;
            this.a1 = this.Y.a();
            this.X.get(this.Z).d(enumC10672xH1, this);
            if (this.b1) {
                cancel();
            }
        }

        @Override // o.InterfaceC9990uU
        public GU e() {
            return this.X.get(0).e();
        }

        @Override // o.InterfaceC9990uU.a
        public void f(Data data) {
            if (data != null) {
                this.Z0.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.b1) {
                return;
            }
            if (this.Z < this.X.size() - 1) {
                this.Z++;
                d(this.Y0, this.Z0);
                return;
            }
            C10175vF1.e(this.a1);
            this.Z0.c(new TD0("Fetch failed", new ArrayList(this.a1)));
        }
    }

    public C5408bm1(List<InterfaceC7595kk1<Model, Data>> list, FE1.a<List<Throwable>> aVar) {
        this.a = list;
        this.b = aVar;
    }

    @Override // o.InterfaceC7595kk1
    public boolean a(Model model) {
        for (InterfaceC7595kk1<Model, Data> interfaceC7595kk1 : this.a) {
            if (interfaceC7595kk1.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC7595kk1
    public InterfaceC7595kk1.a<Data> b(Model model, int i, int i2, C5448bw1 c5448bw1) {
        InterfaceC7595kk1.a<Data> b;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC6575gX0 interfaceC6575gX0 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC7595kk1<Model, Data> interfaceC7595kk1 = this.a.get(i3);
            if (interfaceC7595kk1.a(model) && (b = interfaceC7595kk1.b(model, i, i2, c5448bw1)) != null) {
                interfaceC6575gX0 = b.a;
                arrayList.add(b.c);
            }
        }
        if (arrayList.isEmpty() || interfaceC6575gX0 == null) {
            return null;
        }
        return new InterfaceC7595kk1.a<>(interfaceC6575gX0, new a(arrayList, this.b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
