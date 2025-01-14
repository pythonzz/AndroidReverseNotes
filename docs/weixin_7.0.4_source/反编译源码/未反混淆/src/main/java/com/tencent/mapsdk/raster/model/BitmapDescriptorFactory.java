package com.tencent.mapsdk.raster.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.j;
import com.tencent.tencentmap.mapsdk.a.k;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class BitmapDescriptorFactory {
    public static BitmapDescriptor fromResource(int i) {
        BitmapDescriptor fromBitmap;
        Throwable th;
        Closeable closeable;
        Closeable fromBitmap2 = null;
        AppMethodBeat.i(101153);
        Closeable openRawResource;
        try {
            Context a = j.a();
            if (a != null) {
                openRawResource = a.getResources().openRawResource(i);
                try {
                    fromBitmap2 = fromBitmap(BitmapFactory.decodeStream(openRawResource));
                    k.a(openRawResource);
                    AppMethodBeat.o(101153);
                } catch (Exception e) {
                    k.a(openRawResource);
                    AppMethodBeat.o(101153);
                    return fromBitmap2;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = openRawResource;
                    k.a(closeable);
                    AppMethodBeat.o(101153);
                    throw th;
                }
            }
            k.a(fromBitmap2);
            AppMethodBeat.o(101153);
        } catch (Exception e2) {
            openRawResource = fromBitmap2;
            k.a(openRawResource);
            AppMethodBeat.o(101153);
            return fromBitmap2;
        } catch (Throwable th3) {
            th = th3;
            closeable = fromBitmap2;
            k.a(closeable);
            AppMethodBeat.o(101153);
            throw th;
        }
        return fromBitmap2;
    }

    public static BitmapDescriptor fromView(View view) {
        BitmapDescriptor bitmapDescriptor = null;
        AppMethodBeat.i(101154);
        try {
            Context a = j.a();
            if (a != null) {
                FrameLayout frameLayout = new FrameLayout(a);
                frameLayout.addView(view);
                frameLayout.destroyDrawingCache();
                bitmapDescriptor = fromBitmap(getViewBitmap(frameLayout));
                AppMethodBeat.o(101154);
            } else {
                AppMethodBeat.o(101154);
            }
        } catch (Exception e) {
            AppMethodBeat.o(101154);
        }
        return bitmapDescriptor;
    }

    private static Bitmap getViewBitmap(View view) {
        AppMethodBeat.i(101155);
        view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        Bitmap copy = view.getDrawingCache().copy(Config.ARGB_8888, false);
        AppMethodBeat.o(101155);
        return copy;
    }

    public static BitmapDescriptor fromPath(String str) {
        AppMethodBeat.i(101156);
        try {
            BitmapDescriptor fromBitmap = fromBitmap(BitmapFactory.decodeFile(str));
            AppMethodBeat.o(101156);
            return fromBitmap;
        } catch (Exception e) {
            AppMethodBeat.o(101156);
            return null;
        }
    }

    public static BitmapDescriptor fromAsset(String str) {
        AppMethodBeat.i(101157);
        try {
            InputStream resourceAsStream = BitmapDescriptorFactory.class.getResourceAsStream("/assets/".concat(String.valueOf(str)));
            Bitmap decodeStream = BitmapFactory.decodeStream(resourceAsStream);
            resourceAsStream.close();
            BitmapDescriptor fromBitmap = fromBitmap(decodeStream);
            AppMethodBeat.o(101157);
            return fromBitmap;
        } catch (Exception e) {
            AppMethodBeat.o(101157);
            return null;
        }
    }

    public static BitmapDescriptor fromFile(String str) {
        AppMethodBeat.i(101158);
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
            fileInputStream.close();
            BitmapDescriptor fromBitmap = fromBitmap(decodeStream);
            AppMethodBeat.o(101158);
            return fromBitmap;
        } catch (Exception e) {
            AppMethodBeat.o(101158);
            return null;
        }
    }

    public static BitmapDescriptor defaultMarker() {
        AppMethodBeat.i(101159);
        BitmapDescriptor fromAsset = fromAsset("marker.png");
        AppMethodBeat.o(101159);
        return fromAsset;
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        AppMethodBeat.i(101160);
        if (bitmap == null) {
            AppMethodBeat.o(101160);
            return null;
        }
        BitmapDescriptor bitmapDescriptor = new BitmapDescriptor(bitmap);
        AppMethodBeat.o(101160);
        return bitmapDescriptor;
    }
}
