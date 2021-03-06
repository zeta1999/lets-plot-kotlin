/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.layer.stat

import jetbrains.letsPlot.intern.Options
import jetbrains.letsPlot.intern.layer.OptionsCapsule

interface CountStatAesthetics : OptionsCapsule {
    val x: Any?
    val weight: Any?

    override fun seal(): Options {
        return Options.of(
            "x" to x,
            "weight" to weight
        )
    }
}