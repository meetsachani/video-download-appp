package o;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: o.nR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8270nR extends YR {
    private static final long serialVersionUID = 1;
    public final transient Object X;
    public final transient Field Y;

    public C8270nR() {
        this.X = null;
        this.Y = null;
    }

    public Object a() {
        return this.X;
    }

    public Field b() {
        return this.Y;
    }

    public final String c(Locale locale) {
        String message = super.getMessage();
        if (message == null && a() != null && b() != null) {
            return String.format(ResourceBundle.getBundle(UI0.k, locale).getString("error.introspecting.field"), b().getName(), a().getClass().getCanonicalName());
        }
        return message;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return c(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return c(Locale.US);
    }

    public C8270nR(String str) {
        super(str);
        this.X = null;
        this.Y = null;
    }

    public C8270nR(Object obj, Field field) {
        this.X = obj;
        this.Y = field;
    }

    public C8270nR(Object obj, Field field, String str) {
        super(str);
        this.X = obj;
        this.Y = field;
    }
}
