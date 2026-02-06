package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.c;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import o.AbstractC7322jd;
import o.C10023ud2;
import o.C10138v60;
import o.C10270ve2;
import o.C10595wy1;
import o.C10918yI0;
import o.C10998yd2;
import o.C11003yf;
import o.C11151zF2;
import o.C2726Dd2;
import o.C2736Dg0;
import o.C2779Dr;
import o.C3068Gn;
import o.C3340Jh1;
import o.C3362Jn;
import o.C3438Kh1;
import o.C3460Kn;
import o.C3476Kr;
import o.C3671Mr;
import o.C3753Nn;
import o.C3867Or;
import o.C3964Pr;
import o.C4023Qh1;
import o.C4045Qn;
import o.C4061Qr;
import o.C4355Tr;
import o.C4936Zo0;
import o.C5517cD2;
import o.C5519cE0;
import o.C5823dT1;
import o.C60;
import o.C6399fr2;
import o.C7468kD0;
import o.C7701lA2;
import o.C7711lD0;
import o.C7763lQ0;
import o.C7776lT1;
import o.C7962mA2;
import o.C7972mD0;
import o.C8205nA2;
import o.C8767pT1;
import o.C9091qp0;
import o.C9194rD0;
import o.C9276rZ;
import o.C9745tT1;
import o.E30;
import o.InterfaceC2727De;
import o.InterfaceC4931Zn;
import o.InterfaceC7225jD0;
import o.InterfaceC7290jT1;
import o.InterfaceC7838lk1;
import o.JQ1;
import o.OC2;
import o.QK1;
import o.R9;
import o.VU;
import o.WD0;
import o.YC2;
import o.ZD0;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public class a implements ZD0.b<JQ1> {
        public boolean a;
        public final /* synthetic */ com.bumptech.glide.a b;
        public final /* synthetic */ List c;
        public final /* synthetic */ AbstractC7322jd d;

        public a(com.bumptech.glide.a aVar, List list, AbstractC7322jd abstractC7322jd) {
            this.b = aVar;
            this.c = list;
            this.d = abstractC7322jd;
        }

        @Override // o.ZD0.b
        /* renamed from: a */
        public JQ1 get() {
            if (!this.a) {
                C6399fr2.c("Glide registry");
                this.a = true;
                try {
                    return e.a(this.b, this.c, this.d);
                } finally {
                    this.a = false;
                    C6399fr2.f();
                }
            }
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
    }

    public static JQ1 a(com.bumptech.glide.a aVar, List<WD0> list, AbstractC7322jd abstractC7322jd) {
        InterfaceC4931Zn h = aVar.h();
        InterfaceC2727De g = aVar.g();
        Context applicationContext = aVar.k().getApplicationContext();
        d g2 = aVar.k().g();
        JQ1 jq1 = new JQ1();
        b(applicationContext, jq1, h, g, g2);
        c(applicationContext, aVar, jq1, list, abstractC7322jd);
        return jq1;
    }

    public static void b(Context context, JQ1 jq1, InterfaceC4931Zn interfaceC4931Zn, InterfaceC2727De interfaceC2727De, d dVar) {
        InterfaceC7290jT1 c3476Kr;
        InterfaceC7290jT1 c10023ud2;
        String str;
        JQ1 jq12;
        jq1.t(new C9276rZ());
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            jq1.t(new C2736Dg0());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> g = jq1.g();
        C4061Qr c4061Qr = new C4061Qr(context, g, interfaceC4931Zn, interfaceC2727De);
        InterfaceC7290jT1<ParcelFileDescriptor, Bitmap> m = C11151zF2.m(interfaceC4931Zn);
        C10138v60 c10138v60 = new C10138v60(jq1.g(), resources.getDisplayMetrics(), interfaceC4931Zn, interfaceC2727De);
        if (i >= 28 && dVar.b(b.c.class)) {
            c10023ud2 = new C7763lQ0();
            c3476Kr = new C3671Mr();
        } else {
            c3476Kr = new C3476Kr(c10138v60);
            c10023ud2 = new C10023ud2(c10138v60, interfaceC2727De);
        }
        if (i >= 28) {
            jq1.e("Animation", InputStream.class, Drawable.class, R9.f(g, interfaceC2727De));
            jq1.e("Animation", ByteBuffer.class, Drawable.class, R9.a(g, interfaceC2727De));
        }
        C7776lT1 c7776lT1 = new C7776lT1(context);
        C4045Qn c4045Qn = new C4045Qn(interfaceC2727De);
        C3068Gn c3068Gn = new C3068Gn();
        C7711lD0 c7711lD0 = new C7711lD0();
        ContentResolver contentResolver = context.getContentResolver();
        jq1.c(ByteBuffer.class, new C3867Or()).c(InputStream.class, new C10998yd2(interfaceC2727De)).e(JQ1.m, ByteBuffer.class, Bitmap.class, c3476Kr).e(JQ1.m, InputStream.class, Bitmap.class, c10023ud2);
        if (ParcelFileDescriptorRewinder.a()) {
            str = "Animation";
            jq1.e(JQ1.m, ParcelFileDescriptor.class, Bitmap.class, new C10595wy1(c10138v60));
        } else {
            str = "Animation";
        }
        jq1.e(JQ1.m, AssetFileDescriptor.class, Bitmap.class, C11151zF2.c(interfaceC4931Zn));
        String str2 = str;
        jq1.e(JQ1.m, ParcelFileDescriptor.class, Bitmap.class, m).a(Bitmap.class, Bitmap.class, C8205nA2.a.a()).e(JQ1.m, Bitmap.class, Bitmap.class, new C7701lA2()).d(Bitmap.class, c4045Qn).e(JQ1.n, ByteBuffer.class, BitmapDrawable.class, new C3362Jn(resources, c3476Kr)).e(JQ1.n, InputStream.class, BitmapDrawable.class, new C3362Jn(resources, c10023ud2)).e(JQ1.n, ParcelFileDescriptor.class, BitmapDrawable.class, new C3362Jn(resources, m)).d(BitmapDrawable.class, new C3460Kn(interfaceC4931Zn, c4045Qn)).e(str2, InputStream.class, C7468kD0.class, new C2726Dd2(g, c4061Qr, interfaceC2727De)).e(str2, ByteBuffer.class, C7468kD0.class, c4061Qr).d(C7468kD0.class, new C7972mD0()).a(InterfaceC7225jD0.class, InterfaceC7225jD0.class, C8205nA2.a.a()).e(JQ1.m, InterfaceC7225jD0.class, Bitmap.class, new C9194rD0(interfaceC4931Zn)).b(Uri.class, Drawable.class, c7776lT1).b(Uri.class, Bitmap.class, new C5823dT1(c7776lT1, interfaceC4931Zn)).u(new C4355Tr.a()).a(File.class, ByteBuffer.class, new C3964Pr.b()).a(File.class, InputStream.class, new C9091qp0.e()).b(File.class, File.class, new C4936Zo0()).a(File.class, ParcelFileDescriptor.class, new C9091qp0.b()).a(File.class, File.class, C8205nA2.a.a()).u(new c.a(interfaceC2727De));
        if (ParcelFileDescriptorRewinder.a()) {
            jq12 = jq1;
            jq12.u(new ParcelFileDescriptorRewinder.a());
        } else {
            jq12 = jq1;
        }
        InterfaceC7838lk1<Integer, InputStream> g2 = E30.g(context);
        InterfaceC7838lk1<Integer, AssetFileDescriptor> c = E30.c(context);
        InterfaceC7838lk1<Integer, Drawable> e = E30.e(context);
        Class cls = Integer.TYPE;
        jq12.a(cls, InputStream.class, g2).a(Integer.class, InputStream.class, g2).a(cls, AssetFileDescriptor.class, c).a(Integer.class, AssetFileDescriptor.class, c).a(cls, Drawable.class, e).a(Integer.class, Drawable.class, e).a(Uri.class, InputStream.class, C9745tT1.f(context)).a(Uri.class, AssetFileDescriptor.class, C9745tT1.e(context));
        C8767pT1.d dVar2 = new C8767pT1.d(resources);
        C8767pT1.a aVar = new C8767pT1.a(resources);
        C8767pT1.c cVar = new C8767pT1.c(resources);
        jq12.a(Integer.class, Uri.class, dVar2).a(cls, Uri.class, dVar2).a(Integer.class, AssetFileDescriptor.class, aVar).a(cls, AssetFileDescriptor.class, aVar).a(Integer.class, InputStream.class, cVar).a(cls, InputStream.class, cVar);
        jq12.a(String.class, InputStream.class, new VU.c()).a(Uri.class, InputStream.class, new VU.c()).a(String.class, InputStream.class, new C10270ve2.c()).a(String.class, ParcelFileDescriptor.class, new C10270ve2.b()).a(String.class, AssetFileDescriptor.class, new C10270ve2.a()).a(Uri.class, InputStream.class, new C11003yf.c(context.getAssets())).a(Uri.class, AssetFileDescriptor.class, new C11003yf.b(context.getAssets())).a(Uri.class, InputStream.class, new C3438Kh1.a(context)).a(Uri.class, InputStream.class, new C4023Qh1.a(context));
        if (i >= 29) {
            jq12.a(Uri.class, InputStream.class, new QK1.c(context));
            jq12.a(Uri.class, ParcelFileDescriptor.class, new QK1.b(context));
        }
        boolean b = dVar.b(b.g.class);
        jq12.a(Uri.class, InputStream.class, new OC2.d(contentResolver, b)).a(Uri.class, ParcelFileDescriptor.class, new OC2.b(contentResolver, b)).a(Uri.class, AssetFileDescriptor.class, new OC2.a(contentResolver, b)).a(Uri.class, InputStream.class, new C5517cD2.a()).a(URL.class, InputStream.class, new YC2.a()).a(Uri.class, File.class, new C3340Jh1.a(context)).a(C5519cE0.class, InputStream.class, new C10918yI0.a()).a(byte[].class, ByteBuffer.class, new C2779Dr.a()).a(byte[].class, InputStream.class, new C2779Dr.d()).a(Uri.class, Uri.class, C8205nA2.a.a()).a(Drawable.class, Drawable.class, C8205nA2.a.a()).b(Drawable.class, Drawable.class, new C7962mA2()).v(Bitmap.class, BitmapDrawable.class, new C3753Nn(resources)).v(Bitmap.class, byte[].class, c3068Gn).v(Drawable.class, byte[].class, new C60(interfaceC4931Zn, c3068Gn, c7711lD0)).v(C7468kD0.class, byte[].class, c7711lD0);
        InterfaceC7290jT1<ByteBuffer, Bitmap> d = C11151zF2.d(interfaceC4931Zn);
        jq12.b(ByteBuffer.class, Bitmap.class, d);
        jq12.b(ByteBuffer.class, BitmapDrawable.class, new C3362Jn(resources, d));
    }

    public static void c(Context context, com.bumptech.glide.a aVar, JQ1 jq1, List<WD0> list, AbstractC7322jd abstractC7322jd) {
        for (WD0 wd0 : list) {
            try {
                wd0.b(context, aVar, jq1);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + wd0.getClass().getName(), e);
            }
        }
        if (abstractC7322jd != null) {
            abstractC7322jd.b(context, aVar, jq1);
        }
    }

    public static ZD0.b<JQ1> d(com.bumptech.glide.a aVar, List<WD0> list, AbstractC7322jd abstractC7322jd) {
        return new a(aVar, list, abstractC7322jd);
    }
}
