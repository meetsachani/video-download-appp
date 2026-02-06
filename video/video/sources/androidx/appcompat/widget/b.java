package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C6566gU0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
public class b extends DataSetObservable {
    public static final Object A = new Object();
    public static final Map<String, b> B = new HashMap();
    public static final boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public static final String f10o = "b";
    public static final String p = "historical-records";
    public static final String q = "historical-record";
    public static final String r = "activity";
    public static final String s = "time";
    public static final String t = "weight";
    public static final String u = "activity_choser_model_history.xml";
    public static final int v = 50;
    public static final int w = 5;
    public static final float x = 1.0f;
    public static final String y = ".xml";
    public static final int z = -1;
    public final Context d;
    public final String e;
    public Intent f;
    public f m;
    public final Object a = new Object();
    public final List<C0011b> b = new ArrayList();
    public final List<e> c = new ArrayList();
    public c g = new d();
    public int h = 50;
    public boolean i = true;
    public boolean j = false;
    public boolean k = true;
    public boolean l = false;

    /* loaded from: classes.dex */
    public interface a {
        void setActivityChooserModel(b bVar);
    }

    /* renamed from: androidx.appcompat.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0011b implements Comparable<C0011b> {
        public final ResolveInfo X;
        public float Y;

        public C0011b(ResolveInfo resolveInfo) {
            this.X = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(C0011b c0011b) {
            return Float.floatToIntBits(c0011b.Y) - Float.floatToIntBits(this.Y);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0011b.class == obj.getClass() && Float.floatToIntBits(this.Y) == Float.floatToIntBits(((C0011b) obj).Y)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.Y) + 31;
        }

        public String toString() {
            return C6566gU0.f + "resolveInfo:" + this.X.toString() + "; weight:" + new BigDecimal(this.Y) + C6566gU0.g;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(Intent intent, List<C0011b> list, List<e> list2);
    }

    /* loaded from: classes.dex */
    public static final class d implements c {
        public static final float b = 0.95f;
        public final Map<ComponentName, C0011b> a = new HashMap();

        @Override // androidx.appcompat.widget.b.c
        public void a(Intent intent, List<C0011b> list, List<e> list2) {
            Map<ComponentName, C0011b> map = this.a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0011b c0011b = list.get(i);
                c0011b.Y = 0.0f;
                ActivityInfo activityInfo = c0011b.X.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), c0011b);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                C0011b c0011b2 = map.get(eVar.a);
                if (c0011b2 != null) {
                    c0011b2.Y += eVar.c * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final ComponentName a;
        public final long b;
        public final float c;

        public e(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.a;
            if (componentName == null) {
                if (eVar.a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.a)) {
                return false;
            }
            if (this.b == eVar.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(eVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            ComponentName componentName = this.a;
            if (componentName == null) {
                hashCode = 0;
            } else {
                hashCode = componentName.hashCode();
            }
            long j = this.b;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.c);
        }

        public String toString() {
            return C6566gU0.f + "; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + C6566gU0.g;
        }

        public e(ComponentName componentName, long j, float f) {
            this.a = componentName;
            this.b = j;
            this.c = f;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a(b bVar, Intent intent);
    }

    /* loaded from: classes.dex */
    public final class g extends AsyncTask<Object, Void, Void> {
        public g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
            if (r15 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
            r15.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
            if (r15 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
            if (r15 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
            if (r15 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
            return null;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream openFileOutput = b.this.d.openFileOutput(str, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    try {
                        try {
                            try {
                                newSerializer.setOutput(openFileOutput, null);
                                newSerializer.startDocument("UTF-8", Boolean.TRUE);
                                newSerializer.startTag(null, b.p);
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    e eVar = (e) list.remove(0);
                                    newSerializer.startTag(null, b.q);
                                    newSerializer.attribute(null, b.r, eVar.a.flattenToString());
                                    newSerializer.attribute(null, "time", String.valueOf(eVar.b));
                                    newSerializer.attribute(null, "weight", String.valueOf(eVar.c));
                                    newSerializer.endTag(null, b.q);
                                }
                                newSerializer.endTag(null, b.p);
                                newSerializer.endDocument();
                                b.this.i = true;
                            } catch (IllegalArgumentException e) {
                                Log.e(b.f10o, "Error writing historical record file: " + b.this.e, e);
                                b.this.i = true;
                            }
                        } catch (IllegalStateException e2) {
                            Log.e(b.f10o, "Error writing historical record file: " + b.this.e, e2);
                            b.this.i = true;
                        }
                    } catch (IOException e3) {
                        Log.e(b.f10o, "Error writing historical record file: " + b.this.e, e3);
                        b.this.i = true;
                    }
                } catch (Throwable th) {
                    b.this.i = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e4) {
                Log.e(b.f10o, "Error writing historical record file: " + str, e4);
                return null;
            }
        }
    }

    public b(Context context, String str) {
        this.d = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !str.endsWith(y)) {
            this.e = str + y;
            return;
        }
        this.e = str;
    }

    public static b d(Context context, String str) {
        b bVar;
        synchronized (A) {
            try {
                Map<String, b> map = B;
                bVar = map.get(str);
                if (bVar == null) {
                    bVar = new b(context, str);
                    map.put(str, bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final boolean a(e eVar) {
        boolean add = this.c.add(eVar);
        if (add) {
            this.k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return add;
    }

    public Intent b(int i) {
        synchronized (this.a) {
            try {
                if (this.f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.b.get(i).X.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f);
                intent.setComponent(componentName);
                if (this.m != null) {
                    if (this.m.a(this, new Intent(intent))) {
                        return null;
                    }
                }
                a(new e(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        boolean l = l() | o();
        n();
        if (l) {
            v();
            notifyChanged();
        }
    }

    public ResolveInfo e(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.a) {
            c();
            resolveInfo = this.b.get(i).X;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.a) {
            c();
            size = this.b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.a) {
            try {
                c();
                List<C0011b> list = this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (list.get(i).X == resolveInfo) {
                        return i;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.a) {
            try {
                c();
                if (!this.b.isEmpty()) {
                    return this.b.get(0).X;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int i() {
        int i;
        synchronized (this.a) {
            i = this.h;
        }
        return i;
    }

    public int j() {
        int size;
        synchronized (this.a) {
            c();
            size = this.c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.a) {
            intent = this.f;
        }
        return intent;
    }

    public final boolean l() {
        if (!this.l || this.f == null) {
            return false;
        }
        this.l = false;
        this.b.clear();
        List<ResolveInfo> queryIntentActivities = this.d.getPackageManager().queryIntentActivities(this.f, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.b.add(new C0011b(queryIntentActivities.get(i)));
        }
        return true;
    }

    public final void m() {
        if (this.j) {
            if (this.k) {
                this.k = false;
                if (!TextUtils.isEmpty(this.e)) {
                    new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.c), this.e);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("No preceding call to #readHistoricalData");
    }

    public final void n() {
        int size = this.c.size() - this.h;
        if (size > 0) {
            this.k = true;
            for (int i = 0; i < size; i++) {
                this.c.remove(0);
            }
        }
    }

    public final boolean o() {
        if (!this.i || !this.k || TextUtils.isEmpty(this.e)) {
            return false;
        }
        this.i = false;
        this.j = true;
        p();
        return true;
    }

    public final void p() {
        try {
            FileInputStream openFileInput = this.d.openFileInput(this.e);
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                    }
                    if (p.equals(newPullParser.getName())) {
                        List<e> list = this.c;
                        list.clear();
                        while (true) {
                            int next = newPullParser.next();
                            if (next == 1) {
                                if (openFileInput != null) {
                                    openFileInput.close();
                                    return;
                                }
                                return;
                            } else if (next != 3 && next != 4) {
                                if (q.equals(newPullParser.getName())) {
                                    list.add(new e(newPullParser.getAttributeValue(null, r), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                                } else {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                            }
                        }
                    } else {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                } catch (IOException e2) {
                    String str = f10o;
                    Log.e(str, "Error reading historical recrod file: " + this.e, e2);
                    if (openFileInput == null) {
                        return;
                    }
                    openFileInput.close();
                } catch (XmlPullParserException e3) {
                    String str2 = f10o;
                    Log.e(str2, "Error reading historical recrod file: " + this.e, e3);
                    if (openFileInput == null) {
                        return;
                    }
                    openFileInput.close();
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException | IOException unused2) {
        }
    }

    public void q(c cVar) {
        synchronized (this.a) {
            try {
                if (this.g == cVar) {
                    return;
                }
                this.g = cVar;
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i) {
        float f2;
        synchronized (this.a) {
            try {
                c();
                C0011b c0011b = this.b.get(i);
                C0011b c0011b2 = this.b.get(0);
                if (c0011b2 != null) {
                    f2 = (c0011b2.Y - c0011b.Y) + 5.0f;
                } else {
                    f2 = 1.0f;
                }
                ActivityInfo activityInfo = c0011b.X.activityInfo;
                a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(int i) {
        synchronized (this.a) {
            try {
                if (this.h == i) {
                    return;
                }
                this.h = i;
                n();
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.a) {
            try {
                if (this.f == intent) {
                    return;
                }
                this.f = intent;
                this.l = true;
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(f fVar) {
        synchronized (this.a) {
            this.m = fVar;
        }
    }

    public final boolean v() {
        if (this.g != null && this.f != null && !this.b.isEmpty() && !this.c.isEmpty()) {
            this.g.a(this.f, this.b, Collections.unmodifiableList(this.c));
            return true;
        }
        return false;
    }
}
