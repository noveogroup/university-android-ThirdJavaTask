package com.noveogroup.producer

import com.noveogroup.data.Data

/**
 * Class which produces elements
 */
interface Producer {
    fun produceData(): Data
}
