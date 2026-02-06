package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class BC1 {
    public boolean a = false;
    public final Set<b> b = new C3228Ie();
    public final Map<String, C3226Id1> c = new HashMap();
    public final Comparator<C4377Tx1<String, Float>> d = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<C4377Tx1<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C4377Tx1<String, Float> c4377Tx1, C4377Tx1<String, Float> c4377Tx12) {
            float floatValue = c4377Tx1.b.floatValue();
            float floatValue2 = c4377Tx12.b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f);
    }

    public void a(b bVar) {
        this.b.add(bVar);
    }

    public void b() {
        this.c.clear();
    }

    public List<C4377Tx1<String, Float>> c() {
        if (!this.a) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        for (Map.Entry<String, C3226Id1> entry : this.c.entrySet()) {
            arrayList.add(new C4377Tx1(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.d);
        return arrayList;
    }

    public void d() {
        if (this.a) {
            List<C4377Tx1<String, Float>> c = c();
            Log.d(ZX0.b, "Render times:");
            for (int i = 0; i < c.size(); i++) {
                C4377Tx1<String, Float> c4377Tx1 = c.get(i);
                Log.d(ZX0.b, String.format("\t\t%30s:%.2f", c4377Tx1.a, c4377Tx1.b));
            }
        }
    }

    public void e(String str, float f) {
        if (this.a) {
            C3226Id1 c3226Id1 = this.c.get(str);
            if (c3226Id1 == null) {
                c3226Id1 = new C3226Id1();
                this.c.put(str, c3226Id1);
            }
            c3226Id1.a(f);
            if (str.equals("__container")) {
                for (b bVar : this.b) {
                    bVar.a(f);
                }
            }
        }
    }

    public void f(b bVar) {
        this.b.remove(bVar);
    }

    public void g(boolean z) {
        this.a = z;
    }
}
