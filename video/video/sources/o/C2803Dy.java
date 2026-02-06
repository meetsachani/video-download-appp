package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: o.Dy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2803Dy {
    public static final void a(Canvas canvas, float f, float f2, float f3, float f4, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void b(Canvas canvas, int i, int i2, int i3, int i4, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void c(Canvas canvas, Path path, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void d(Canvas canvas, Rect rect, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void e(Canvas canvas, RectF rectF, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void f(Canvas canvas, Matrix matrix, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static /* synthetic */ void g(Canvas canvas, Matrix matrix, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void h(Canvas canvas, float f, float f2, float f3, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static /* synthetic */ void i(Canvas canvas, float f, float f2, float f3, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void j(Canvas canvas, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void k(Canvas canvas, float f, float f2, float f3, float f4, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static /* synthetic */ void l(Canvas canvas, float f, float f2, float f3, float f4, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void m(Canvas canvas, float f, float f2, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static /* synthetic */ void n(Canvas canvas, float f, float f2, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static final void o(Canvas canvas, float f, float f2, HA0<? super Canvas, C7458kA2> ha0) {
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }

    public static /* synthetic */ void p(Canvas canvas, float f, float f2, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            ha0.invoke(canvas);
        } finally {
            UP0.d(1);
            canvas.restoreToCount(save);
            UP0.c(1);
        }
    }
}
