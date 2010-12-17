object SearchUtils{
  def linearSearch(list: List[AnyRef], x: AnyRef, i: Int): Int =
    if(i >= list.length) -1
    else if(list(i) == x) i
    else linearSearch(list, x, i+1)
}