package com.facebook.share;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.A;
import com.facebook.C;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.InterfaceC2411u;
import com.facebook.S;
import com.facebook.Y;
import com.facebook.internal.C2362g;
import com.facebook.internal.W;
import com.facebook.internal.Z;
import com.facebook.internal.l0;
import com.facebook.share.e;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o.AbstractC9885u32;
import o.C10128v32;
import o.C10617x32;
import o.C6566gU0;
import o.D32;
import o.E32;
import o.L32;
import o.M32;
import o.S32;
import o.SQ;
import o.TG2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    public static final String d = "ShareApi";
    public static final String e = "me";
    public static final String f = "photos";
    public static final String g = "%s/%s";
    public static final String h = "UTF-8";
    public String a;
    public String b = "me";
    public final AbstractC9885u32 c;

    /* loaded from: classes2.dex */
    public class a implements S.b {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ W c;
        public final /* synthetic */ InterfaceC2411u d;

        public a(final ArrayList val$results, final ArrayList val$errorResponses, final W val$requestCount, final InterfaceC2411u val$callback) {
            this.a = val$results;
            this.b = val$errorResponses;
            this.c = val$requestCount;
            this.d = val$callback;
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
        @Override // com.facebook.S.b
        public void a(Y response) {
            JSONObject i = response.i();
            if (i != null) {
                this.a.add(i);
            }
            if (response.g() != null) {
                this.b.add(response);
            }
            W w = this.c;
            w.a = Integer.valueOf(((Integer) w.a).intValue() - 1);
            if (((Integer) this.c.a).intValue() == 0) {
                if (!this.b.isEmpty()) {
                    D32.t(this.d, null, (Y) this.b.get(0));
                } else if (!this.a.isEmpty()) {
                    D32.t(this.d, ((JSONObject) this.a.get(0)).optString("id"), response);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements S.b {
        public final /* synthetic */ InterfaceC2411u a;

        public b(final InterfaceC2411u val$callback) {
            this.a = val$callback;
        }

        @Override // com.facebook.S.b
        public void a(Y response) {
            String optString;
            JSONObject i = response.i();
            if (i == null) {
                optString = null;
            } else {
                optString = i.optString("id");
            }
            D32.t(this.a, optString, response);
        }
    }

    /* renamed from: com.facebook.share.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0089c implements C2362g.c<Integer> {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ JSONArray b;

        /* renamed from: com.facebook.share.c$c$a */
        /* loaded from: classes2.dex */
        public class a implements Iterator<Integer> {
            public final /* synthetic */ W X;
            public final /* synthetic */ int Y;

            public a(final W val$current, final int val$size) {
                this.X = val$current;
                this.Y = val$size;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (((Integer) this.X.a).intValue() < this.Y) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
            @Override // java.util.Iterator
            public Integer next() {
                W w = this.X;
                T t = w.a;
                Integer num = (Integer) t;
                w.a = Integer.valueOf(((Integer) t).intValue() + 1);
                return num;
            }
        }

        public C0089c(final ArrayList val$arrayList, final JSONArray val$stagedObject) {
            this.a = val$arrayList;
            this.b = val$stagedObject;
        }

        @Override // com.facebook.internal.C2362g.c
        public Iterator<Integer> a() {
            return new a(new W(0), this.a.size());
        }

        @Override // com.facebook.internal.C2362g.c
        /* renamed from: c */
        public Object get(Integer key) {
            return this.a.get(key.intValue());
        }

        @Override // com.facebook.internal.C2362g.c
        /* renamed from: d */
        public void b(Integer key, Object value, C2362g.d onErrorListener) {
            try {
                this.b.put(key.intValue(), value);
            } catch (JSONException e) {
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Error staging object.";
                }
                onErrorListener.b(new C2416z(localizedMessage));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements C2362g.f {
        public final /* synthetic */ C2362g.e a;
        public final /* synthetic */ JSONArray b;

        public d(final C2362g.e val$onArrayListStagedListener, final JSONArray val$stagedObject) {
            this.a = val$onArrayListStagedListener;
            this.b = val$stagedObject;
        }

        @Override // com.facebook.internal.C2362g.f
        public void a() {
            this.a.c(this.b);
        }

        @Override // com.facebook.internal.C2362g.d
        public void b(C2416z exception) {
            this.a.b(exception);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements C2362g.InterfaceC0084g {
        public e() {
        }

        @Override // com.facebook.internal.C2362g.InterfaceC0084g
        public void a(Object value, C2362g.e onMapValueCompleteListener) {
            if (value instanceof ArrayList) {
                c.a(c.this, (ArrayList) value, onMapValueCompleteListener);
            } else if (value instanceof L32) {
                c.b(c.this, (L32) value, onMapValueCompleteListener);
            } else {
                onMapValueCompleteListener.c(value);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements S.b {
        public final /* synthetic */ C2362g.e a;
        public final /* synthetic */ L32 b;

        public f(final C2362g.e val$onPhotoStagedListener, final L32 val$photo) {
            this.a = val$onPhotoStagedListener;
            this.b = val$photo;
        }

        @Override // com.facebook.S.b
        public void a(Y response) {
            C g = response.g();
            String str = "Error staging photo.";
            if (g != null) {
                String h = g.h();
                if (h != null) {
                    str = h;
                }
                this.a.b(new A(response, str));
                return;
            }
            JSONObject i = response.i();
            if (i == null) {
                this.a.b(new C2416z("Error staging photo."));
                return;
            }
            String optString = i.optString("uri");
            if (optString == null) {
                this.a.b(new C2416z("Error staging photo."));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", optString);
                jSONObject.put(Z.I0, this.b.g());
                this.a.c(jSONObject);
            } catch (JSONException e) {
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage != null) {
                    str = localizedMessage;
                }
                this.a.b(new C2416z(str));
            }
        }
    }

    public c(final AbstractC9885u32 shareContent) {
        this.c = shareContent;
    }

    public static /* synthetic */ void a(c cVar, ArrayList arrayList, C2362g.e eVar) {
        if (SQ.e(c.class)) {
            return;
        }
        try {
            cVar.s(arrayList, eVar);
        } catch (Throwable th) {
            SQ.c(th, c.class);
        }
    }

    public static /* synthetic */ void b(c cVar, L32 l32, C2362g.e eVar) {
        if (SQ.e(c.class)) {
            return;
        }
        try {
            cVar.u(l32, eVar);
        } catch (Throwable th) {
            SQ.c(th, c.class);
        }
    }

    public static void j(Bundle parameters) {
        if (!SQ.e(c.class)) {
            try {
                String string = parameters.getString("image");
                if (string != null) {
                    try {
                        try {
                            JSONArray jSONArray = new JSONArray(string);
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    k(parameters, i, optJSONObject);
                                } else {
                                    parameters.putString(String.format(Locale.ROOT, "image[%d][url]", Integer.valueOf(i)), jSONArray.getString(i));
                                }
                            }
                            parameters.remove("image");
                        } catch (JSONException unused) {
                            k(parameters, 0, new JSONObject(string));
                            parameters.remove("image");
                        }
                    } catch (JSONException unused2) {
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, c.class);
            }
        }
    }

    public static void k(Bundle parameters, int index, JSONObject image) throws JSONException {
        if (!SQ.e(c.class)) {
            try {
                Iterator<String> keys = image.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    parameters.putString(String.format(Locale.ROOT, "image[%d][%s]", Integer.valueOf(index), next), image.get(next).toString());
                }
            } catch (Throwable th) {
                SQ.c(th, c.class);
            }
        }
    }

    public static void o(final AbstractC9885u32 shareContent, final InterfaceC2411u<e.a> callback) {
        if (SQ.e(c.class)) {
            return;
        }
        try {
            new c(shareContent).n(callback);
        } catch (Throwable th) {
            SQ.c(th, c.class);
        }
    }

    public final void c(final Bundle bundle, AbstractC9885u32 shareContent) {
        if (!SQ.e(this)) {
            try {
                List<String> c = shareContent.c();
                if (!l0.g0(c)) {
                    bundle.putString("tags", TextUtils.join(C6566gU0.h, c));
                }
                if (!l0.f0(shareContent.d())) {
                    bundle.putString("place", shareContent.d());
                }
                if (!l0.f0(shareContent.b())) {
                    bundle.putString("page", shareContent.b());
                }
                if (!l0.f0(shareContent.e())) {
                    bundle.putString("ref", shareContent.e());
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public boolean d() {
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (h() == null) {
                return false;
            }
            C0376a k = C0376a.k();
            if (!C0376a.z()) {
                return false;
            }
            Set<String> u = k.u();
            if (u != null && u.contains("publish_actions")) {
                return true;
            }
            Log.w(d, "The publish_actions permissions are missing, the share will fail unless this app was authorized to publish in another installation.");
            return true;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public String e() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final String f(final String pathAfterGraphNode) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return String.format(Locale.ROOT, g, URLEncoder.encode(e(), "UTF-8"), pathAfterGraphNode);
        } catch (UnsupportedEncodingException unused) {
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public String g() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public AbstractC9885u32 h() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.c;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final Bundle i(L32 photo, M32 photoContent) throws JSONException {
        if (SQ.e(this)) {
            return null;
        }
        try {
            Bundle c = photo.c();
            if (!c.containsKey("place") && !l0.f0(photoContent.d())) {
                c.putString("place", photoContent.d());
            }
            if (!c.containsKey("tags") && !l0.g0(photoContent.c())) {
                List<String> c2 = photoContent.c();
                if (!l0.g0(c2)) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str : c2) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("tag_uid", str);
                        jSONArray.put(jSONObject);
                    }
                    c.putString("tags", jSONArray.toString());
                }
            }
            if (!c.containsKey("ref") && !l0.f0(photoContent.e())) {
                c.putString("ref", photoContent.e());
            }
            return c;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public void l(final String graphNode) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.b = graphNode;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public void m(final String message) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.a = message;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public void n(InterfaceC2411u<e.a> callback) {
        if (!SQ.e(this)) {
            try {
                if (!d()) {
                    D32.r(callback, "Insufficient permissions for sharing content via Api.");
                    return;
                }
                AbstractC9885u32 h2 = h();
                try {
                    C10128v32.m(h2);
                    if (h2 instanceof E32) {
                        p((E32) h2, callback);
                    } else if (h2 instanceof M32) {
                        q((M32) h2, callback);
                    } else if (h2 instanceof S32) {
                        r((S32) h2, callback);
                    }
                } catch (C2416z e2) {
                    D32.s(callback, e2);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void p(final E32 linkContent, final InterfaceC2411u<e.a> callback) {
        if (SQ.e(this)) {
            return;
        }
        try {
            b bVar = new b(callback);
            Bundle bundle = new Bundle();
            c(bundle, linkContent);
            bundle.putString("message", g());
            bundle.putString("link", l0.Q(linkContent.a()));
            bundle.putString("ref", linkContent.e());
            new S(C0376a.k(), f(C10617x32.n), bundle, com.facebook.Z.POST, bVar).n();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [T, java.lang.Integer] */
    public final void q(final M32 photoContent, final InterfaceC2411u<e.a> callback) {
        C0376a c0376a;
        if (!SQ.e(this)) {
            try {
                W w = new W(0);
                C0376a k = C0376a.k();
                ArrayList arrayList = new ArrayList();
                try {
                    a aVar = new a(new ArrayList(), new ArrayList(), w, callback);
                    try {
                        for (L32 l32 : photoContent.h()) {
                            try {
                                Bundle i = i(l32, photoContent);
                                Bitmap d2 = l32.d();
                                Uri f2 = l32.f();
                                String e2 = l32.e();
                                if (e2 == null) {
                                    e2 = g();
                                }
                                String str = e2;
                                if (d2 != null) {
                                    c0376a = k;
                                    arrayList.add(S.b0(c0376a, f(f), d2, str, i, aVar));
                                } else {
                                    c0376a = k;
                                    if (f2 != null) {
                                        arrayList.add(S.c0(c0376a, f(f), f2, str, i, aVar));
                                    }
                                }
                                k = c0376a;
                            } catch (JSONException e3) {
                                D32.s(callback, e3);
                                return;
                            }
                        }
                        w.a = Integer.valueOf(((Integer) w.a).intValue() + arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((S) it.next()).n();
                        }
                    } catch (FileNotFoundException e4) {
                        D32.s(callback, e4);
                    }
                } catch (Throwable th) {
                    th = th;
                    SQ.c(th, this);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void r(final S32 videoContent, final InterfaceC2411u<e.a> callback) {
        if (!SQ.e(this)) {
            try {
                try {
                    TG2.t(videoContent, e(), callback);
                } catch (FileNotFoundException e2) {
                    D32.s(callback, e2);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void s(final ArrayList arrayList, final C2362g.e onArrayListStagedListener) {
        if (SQ.e(this)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            t(new C0089c(arrayList, jSONArray), new d(onArrayListStagedListener, jSONArray));
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final <T> void t(final C2362g.c<T> collection, final C2362g.f onCollectionValuesStagedListener) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C2362g.a(collection, new e(), onCollectionValuesStagedListener);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void u(final L32 photo, final C2362g.e onPhotoStagedListener) {
        if (!SQ.e(this)) {
            try {
                Bitmap d2 = photo.d();
                Uri f2 = photo.f();
                if (d2 == null && f2 == null) {
                    onPhotoStagedListener.b(new C2416z("Photos must have an imageURL or bitmap."));
                    return;
                }
                f fVar = new f(onPhotoStagedListener, photo);
                if (d2 != null) {
                    D32.A(C0376a.k(), d2, fVar).n();
                    return;
                }
                try {
                    D32.B(C0376a.k(), f2, fVar).n();
                } catch (FileNotFoundException e2) {
                    String localizedMessage = e2.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = "Error staging photo.";
                    }
                    onPhotoStagedListener.b(new C2416z(localizedMessage));
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
