package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.b42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5239b42 extends CH2 {
    public LiveData<List<HF2>> d;
    public C7364jn1<List<HF2>> e;
    public Handler f;

    public C5239b42() {
        C7364jn1<List<HF2>> c7364jn1 = new C7364jn1<>(new ArrayList());
        this.e = c7364jn1;
        this.d = c7364jn1;
        this.f = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void g(final C5239b42 c5239b42, Context context) {
        c5239b42.getClass();
        List<File> d = BS2.d(context);
        final ArrayList arrayList = new ArrayList();
        for (File file : d) {
            Log.d("CJJEJJE", "getPath: " + file.getPath());
            try {
                Pair<Long, Long> e = BS2.e(file.getPath());
                arrayList.add(new HF2(file.getName(), BS2.c(((Long) e.second).longValue()), BS2.b(((Long) e.first).longValue()), file));
            } catch (Exception e2) {
                Log.d("CJJEJJE", "run: " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        c5239b42.f.post(new Runnable() { // from class: o.a42
            @Override // java.lang.Runnable
            public final void run() {
                C5239b42.this.e.r(arrayList);
            }
        });
    }

    public void i(final Context context) {
        new Thread(new Runnable() { // from class: o.Z32
            @Override // java.lang.Runnable
            public final void run() {
                C5239b42.g(C5239b42.this, context);
            }
        }).start();
    }
}
