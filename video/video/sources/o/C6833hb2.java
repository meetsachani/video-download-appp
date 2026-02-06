package o;

import java.sql.Date;
import java.text.ParseException;
import java.util.Locale;

/* renamed from: o.hb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6833hb2 extends C7781lV {
    public C6833hb2() {
        this(false);
    }

    @Override // o.C7781lV, o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        return new Date(((java.util.Date) super.g(obj, str)).getTime());
    }

    public C6833hb2(boolean z) {
        this(Locale.getDefault(), z);
    }

    public C6833hb2(Locale locale) {
        this(locale, false);
    }

    public C6833hb2(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public C6833hb2(Locale locale, String str) {
        this(locale, str, false);
    }

    public C6833hb2(Locale locale, String str, boolean z) {
        super(locale, str, z);
    }

    public C6833hb2(Object obj) {
        this(obj, false);
    }

    public C6833hb2(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public C6833hb2(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public C6833hb2(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public C6833hb2(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public C6833hb2(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
    }
}
