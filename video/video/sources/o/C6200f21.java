package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: o.f21  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6200f21 {
    public static final String f = "LocalBroadcastManager";
    public static final boolean g = false;
    public static final int h = 1;
    public static final Object i = new Object();
    public static C6200f21 j;
    public final Context a;
    public final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap<>();
    public final HashMap<String, ArrayList<c>> c = new HashMap<>();
    public final ArrayList<b> d = new ArrayList<>();
    public final Handler e;

    /* renamed from: o.f21$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C6200f21.this.a();
            }
        }
    }

    /* renamed from: o.f21$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final Intent a;
        public final ArrayList<c> b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    /* renamed from: o.f21$c */
    /* loaded from: classes.dex */
    public static final class c {
        public final IntentFilter a;
        public final BroadcastReceiver b;
        public boolean c;
        public boolean d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C6200f21(Context context) {
        this.a = context;
        this.e = new a(context.getMainLooper());
    }

    public static C6200f21 b(Context context) {
        C6200f21 c6200f21;
        synchronized (i) {
            try {
                if (j == null) {
                    j = new C6200f21(context.getApplicationContext());
                }
                c6200f21 = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6200f21;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.b) {
                try {
                    size = this.d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.d.toArray(bVarArr);
                    this.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = bVarArr[i2];
                int size2 = bVar.b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c cVar = bVar.b.get(i3);
                    if (!cVar.d) {
                        cVar.b.onReceive(this.a, bVar.a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList<c> arrayList2 = this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(Intent intent) {
        boolean z;
        String str;
        String str2;
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                if ((intent.getFlags() & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Log.v(f, "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList = this.c.get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        Log.v(f, "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        c cVar = arrayList.get(i2);
                        if (z) {
                            Log.v(f, "Matching against filter " + cVar.a);
                        }
                        if (cVar.c) {
                            if (z) {
                                Log.v(f, "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int match = cVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, f);
                            if (match >= 0) {
                                if (z) {
                                    StringBuilder sb = new StringBuilder();
                                    str = action;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(match));
                                    Log.v(f, sb.toString());
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.c = true;
                            } else {
                                str = action;
                                if (z) {
                                    if (match != -4) {
                                        if (match != -3) {
                                            if (match != -2) {
                                                if (match != -1) {
                                                    str2 = "unknown reason";
                                                } else {
                                                    str2 = "type";
                                                }
                                            } else {
                                                str2 = "data";
                                            }
                                        } else {
                                            str2 = "action";
                                        }
                                    } else {
                                        str2 = "category";
                                    }
                                    Log.v(f, "  Filter did not match: " + str2);
                                }
                            }
                        }
                        i2++;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((c) arrayList2.get(i3)).c = false;
                        }
                        this.d.add(new b(intent, arrayList2));
                        if (!this.e.hasMessages(1)) {
                            this.e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            try {
                ArrayList<c> remove = this.b.remove(broadcastReceiver);
                if (remove == null) {
                    return;
                }
                for (int size = remove.size() - 1; size >= 0; size--) {
                    c cVar = remove.get(size);
                    cVar.d = true;
                    for (int i2 = 0; i2 < cVar.a.countActions(); i2++) {
                        String action = cVar.a.getAction(i2);
                        ArrayList<c> arrayList = this.c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.b == broadcastReceiver) {
                                    cVar2.d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
