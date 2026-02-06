package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o.C5693cx0;
import o.C5935dx0;

/* renamed from: o.vw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10345vw2 extends C10588ww2 {
    public static final String d = "TypefaceCompatApi29Impl";

    public static FontFamily q(CancellationSignal cancellationSignal, C5935dx0.c[] cVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (C5935dx0.c cVar : cVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(cVar.d(), "r", cancellationSignal);
            } catch (IOException e) {
                Log.w(d, "Font load failed", e);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                Font build = new Font.Builder(openFileDescriptor).setWeight(cVar.e()).setSlant(cVar.f() ? 1 : 0).setTtcIndex(cVar.c()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int r(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override // o.C10588ww2
    public Typeface b(Context context, C5693cx0.d dVar, Resources resources, int i) {
        C5693cx0.e[] a;
        try {
            FontFamily.Builder builder = null;
            for (C5693cx0.e eVar : dVar.a()) {
                try {
                    Font build = new Font.Builder(resources, eVar.b()).setWeight(eVar.e()).setSlant(eVar.f() ? 1 : 0).setTtcIndex(eVar.c()).setFontVariationSettings(eVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(p(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w(d, "Font load failed", e);
            return null;
        }
    }

    @Override // o.C10588ww2
    public Typeface d(Context context, CancellationSignal cancellationSignal, C5935dx0.c[] cVarArr, int i) {
        try {
            FontFamily q = q(cancellationSignal, cVarArr, context.getContentResolver());
            if (q == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(q).setStyle(p(q, i).getStyle()).build();
        } catch (Exception e) {
            Log.w(d, "Font load failed", e);
            return null;
        }
    }

    @Override // o.C10588ww2
    public Typeface e(Context context, CancellationSignal cancellationSignal, List<C5935dx0.c[]> list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily q = q(cancellationSignal, list.get(0), contentResolver);
            if (q == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(q);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily q2 = q(cancellationSignal, list.get(i2), contentResolver);
                if (q2 != null) {
                    customFallbackBuilder.addCustomFallback(q2);
                }
            }
            return customFallbackBuilder.setStyle(p(q, i).getStyle()).build();
        } catch (Exception e) {
            Log.w(d, "Font load failed", e);
            return null;
        }
    }

    @Override // o.C10588ww2
    public Typeface f(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // o.C10588ww2
    public Typeface g(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w(d, "Font load failed", e);
            return null;
        }
    }

    @Override // o.C10588ww2
    public Typeface h(Context context, Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    @Override // o.C10588ww2
    public C5935dx0.c m(C5935dx0.c[] cVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font p(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int r = r(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int r2 = r(fontStyle, font2.getStyle());
            if (r2 < r) {
                font = font2;
                r = r2;
            }
        }
        return font;
    }
}
